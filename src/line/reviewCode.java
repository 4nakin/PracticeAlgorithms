package line;

public class MainActivity extends Activity {
    //Change the extend to AppCompatActivity. It's good to support for Material Design

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Create model class to hold user data. It's easier to reuse, maintain and expand.
        //If the select users need to run on other thread to prevent freeze. Cause this is a heavy task.
        //And also add the loading icon or skeleton view to wait the task is done
        List<Pair<String, String>> users = UserDAO.selectUsers();
        MyAdapter adapter = new MyAdapter(users);
        //Create variable to hold instance view, it's easier to reuse and make code cleaner
        //Use Recyclerview instead of Listview. Performance is better for the long list item and each item has image inside
        ((ListView) findViewById(R.id.list)).setAdapter(adapter);
    }

    //Need to create a file for this class. The inner class need to be static class
    public static class MyAdapter extends ArrayAdapter<Pair<String, String>> {
        //Remove this
        private Map<String, Bitmap> cache = new HashMap<>();

        //Need to pass the context to adapter by constructor
        public MyAdapter(List<Pair<String, String>> list) {
            super(MainActivity.this, R.layout.item, list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //View id should have view type in name as R.id.nameTextView. It's make the code be clean
            TextView tvName = convertView.findViewById(R.id.name);
            ImageView ivProfileImg = convertView.findViewById(R.id.profileImg);

            Pair<String, String> pair = getItem(position);
            tvName.setText(pair.first);
            ivProfileImg.setImageBitmap(getProfileImg(pair.second));
            return convertView;
        }

        //Should use third party library to load image from url such as Glide. The library also
        //support cache data
        private Bitmap getProfileImg(String url) {
            //Must not hold bitmap cache like this. It can lead to out of memory
            //Use LruCache or DiskLruCache to cache data
            Bitmap bitmap = cache.get(url);
            if (bitmap != null) return bitmap;

            //Store to file should be aware clear it when we don't use it anymore
            //To prevent our app more than bigger day by day in user device
            File file = ThumbDAO.downloadProfileImg(getContext(), url);
            if (file == null) return null;

            try {
                //Need to user BitmapFactory Option to decode bound first to scale down image to
                //suitable size before decode image to bitmap. It prevent out of memory.
                bitmap = BitmapFactory.decodeStream(new FileInputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {

            }
            return bitmap;
        }

    }

}
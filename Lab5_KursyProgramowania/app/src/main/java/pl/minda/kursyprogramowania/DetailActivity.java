package pl.minda.kursyprogramowania;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends Activity {

    public static final String EXTRA_COURSE_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        CourseDetailFragment courseDetailFragment = (CourseDetailFragment)
                getFragmentManager().findFragmentById(R.id.detail_frag);
        int courseId = (int) getIntent().getExtras().get(EXTRA_COURSE_ID);
        courseDetailFragment.setCourse(courseId);
    }
}

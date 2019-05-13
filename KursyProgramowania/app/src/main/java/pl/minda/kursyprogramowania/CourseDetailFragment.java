package pl.minda.kursyprogramowania;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourseDetailFragment extends Fragment {

    private long courseId;

    public CourseDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            courseId = savedInstanceState.getLong("courseId");
        } else {
            FragmentTransaction ft = getChildFragmentManager().beginTransaction();
            StopwatchFragment stopwatchFragment = new StopwatchFragment();
            ft.replace(R.id.stopwatch_container, stopwatchFragment);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }
        return inflater.inflate(R.layout.fragment_course_detail, container, false);
    }

        @Override
        public void onStart () {
            super.onStart();
            View view = getView();
            if (view != null) {
                TextView title = (TextView) view.findViewById(R.id.textTitle);
                Course course = Course.course[(int) courseId];
                title.setText(course.getName());
                TextView description = (TextView) view.findViewById(R.id.textDescription);
                description.setText(course.getDescription());
            }
        }

        @Override
        public void onSaveInstanceState (Bundle savedInstanceState){
            savedInstanceState.putLong("courseId", courseId);
        }

        public void setCourse ( long id){
            this.courseId = id;
        }
}


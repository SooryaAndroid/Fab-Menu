package com.android.floatingactionbutton;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);

//        findViewById(R.id.pink_icon).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Clicked pink Floating Action Button", Toast.LENGTH_SHORT).show();
//            }
//        });

//        FloatingActionButton button = (FloatingActionButton) findViewById(R.id.setter);
//        button.setSize(FloatingActionButton.SIZE_MINI);
//        button.setColorNormalResId(R.color.pink);
//        button.setColorPressedResId(R.color.pink_pressed);
//        button.setIcon(R.drawable.fab_star);
//        button.setStrokeVisible(false);

       // final View actionB = findViewById(R.id.action_b);





//        FloatingActionButton actionC = new FloatingActionButton(getBaseContext());
//        actionC.setTitle("Hide/Show Action above");
//        actionC.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                actionB.setVisibility(actionB.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
//                Toast.makeText(MainActivity.this, "clicked1", Toast.LENGTH_SHORT).show();
//            }
//        });






//        final FloatingActionsMenu menuMultipleActions = (FloatingActionsMenu) findViewById(R.id.multiple_actions);
//        menuMultipleActions.addButton(actionC);





//        final FloatingActionButton removeAction = (FloatingActionButton) findViewById(R.id.button_remove);
//        removeAction.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ((FloatingActionsMenu) findViewById(R.id.multiple_actions_down)).removeButton(removeAction);
//            }
//        });

//        ShapeDrawable drawable = new ShapeDrawable(new OvalShape());
//        drawable.getPaint().setColor(getResources().getColor(R.color.white));
//        ((FloatingActionButton) findViewById(R.id.setter_drawable)).setIconDrawable(drawable);





        final FloatingActionButton actionA = (FloatingActionButton) findViewById(R.id.action_a);
        actionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                actionA.setTitle("Action A clicked");
                Toast.makeText(MainActivity.this, "clicked_A", Toast.LENGTH_SHORT).show();
            }
        });


        final FloatingActionButton actionB = (FloatingActionButton) findViewById(R.id.action_b);
        actionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                actionA.setTitle("Action A clicked");
                Toast.makeText(MainActivity.this, "clicked_B", Toast.LENGTH_SHORT).show();
            }
        });



        // Test that FAMs containing FABs with visibility GONE do not cause crashes
        //findViewById(R.id.button_gone).setVisibility(View.GONE);

//        final FloatingActionButton actionEnable = (FloatingActionButton) findViewById(R.id.action_enable);
//        actionEnable.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                menuMultipleActions.setEnabled(!menuMultipleActions.isEnabled());
//            }
//        });

//        FloatingActionsMenu rightLabels = (FloatingActionsMenu) findViewById(R.id.right_labels);
//        FloatingActionButton addedOnce = new FloatingActionButton(this);
//        addedOnce.setTitle("Added once");
//        rightLabels.addButton(addedOnce);
//
//        FloatingActionButton addedTwice = new FloatingActionButton(this);
//        addedTwice.setTitle("Added twice");
//        rightLabels.addButton(addedTwice);
//        rightLabels.removeButton(addedTwice);
//        rightLabels.addButton(addedTwice);
    }
}
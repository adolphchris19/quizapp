package com.example.android.quizapp;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Declaration of global variables.
    int score = 0;
    int scoreTwo =0;
    int scoreThree = 0;
    int scoreFour = 0;
    int scoreFive = 0;
    int scoreSix = 0;
    int scoreSeven = 0;
    int scoreEight = 0;
    int scoreNine = 0;
    int scoreTen =0;
    //Beginning of the onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//end of onCreate
    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()){
            // Beginning question 1
            case R.id.button_1a:
                if (checked)
                    score = 0;
                break;
            case R.id.button_1b:
                if (checked)
                    score = 0;
                break;
            case R.id.button_1c:
                if (checked)
                    score += 1;
                break;
            case R.id.button_1d:
                if (checked)
                    score = 0;
                break;
            //End of question 1
            //Beginning of question 2
            case R.id.button_2a:
                if (checked)
                    scoreTwo += 1;
                break;
            case R.id.button_2b:
                if (checked)
                    scoreTwo = 0;
                break;
            case R.id.button_2c:
                if (checked)
                    scoreTwo = 0;
                break;
            case R.id.button_2d:
                if (checked)
                    scoreTwo = 0;
                break;
            //End of question 2
            //Beginning of question 3
            case R.id.button_3a:
                if (checked)
                    scoreThree += 0;
                break;
            case R.id.button_3b:
                if (checked)
                    scoreThree = 1;
                break;
            case R.id.button_3c:
                if (checked)
                    scoreThree = 0;
                break;
            case R.id.button_3d:
                if (checked)
                    scoreThree = 0;
                break;
            //End of question 3
            //Beginning of question 4
            case R.id.button_4a:
                if (checked)
                    scoreFour += 0;
                break;
            case R.id.button_4b:
                if (checked)
                    scoreFour = 1;
                break;
            case R.id.button_4c:
                if (checked)
                    scoreFour = 0;
                break;
            case R.id.button_4d:
                if (checked)
                    scoreFour = 0;
                break;
            //End of question 4
        }
    }
    // Beginning of Question 5
    public void onCheckboxClicked(View view){
        switch (view.getId()){
            case R.id.checkbox_5a:
                doubleCheckedboxes();
                break;
            case R.id.checkbox_5b:
                doubleCheckedboxes();
                break;
            case R.id.checkbox_5c:
                doubleCheckedboxes();
                break;
            case R.id.checkbox_5d:
                doubleCheckedboxes();
                break;
        }
    }
    private void doubleCheckedboxes(){
        CheckBox CB1 = findViewById(R.id.checkbox_5a);//wrong answer
        CheckBox CB2 = findViewById(R.id.checkbox_5b);//correct answer
        CheckBox CB3 = findViewById(R.id.checkbox_5c);//wrong answer
        CheckBox CB4 = findViewById(R.id.checkbox_5d);//correct answer

        boolean correctAnswer = CB2.isChecked() && CB4.isChecked();
        boolean wrongAnswer = CB1.isChecked() || CB3.isChecked();

        if (correctAnswer && !wrongAnswer){
            scoreFive =+ 1;
        }else {
            scoreFive = 0;
        }
    }
    //End of Question 5

    //Beginning of Question Seven
    public void onCheckboxClickedTwo(View view){
        switch (view.getId()){
            case R.id.checkbox_7a:
                doubleCheckedboxesTwo();
                break;

            case R.id.checkbox_7b:
                doubleCheckedboxesTwo();
                break;

            case R.id.checkbox_7c:
                doubleCheckedboxesTwo();
                break;

            case R.id.checkbox_7d:
                doubleCheckedboxesTwo();
                break;
        }
    }

    private void doubleCheckedboxesTwo(){
        CheckBox secondCB1 = findViewById(R.id.checkbox_7a);//wrong answer
        CheckBox secondCB2 = findViewById(R.id.checkbox_7b);//correct answer
        CheckBox secondCB3 = findViewById(R.id.checkbox_7c);//wrong answer
        CheckBox secondCB4 = findViewById(R.id.checkbox_7d);//correct answer

        boolean correctAnswer = secondCB2.isChecked() && secondCB4.isChecked();
        boolean wrongAnswer = secondCB1.isChecked() || secondCB3.isChecked();

        if (correctAnswer && !wrongAnswer){
            scoreSeven =+ 1;
        }else {
            scoreSeven = 0;
        }
    }

    //End Question Seven

    //Beginning of Question Nine
    public void onCheckboxClickedThree(View view){
        switch (view.getId()){
            case R.id.checkbox_9a:
                doubleCheckedboxesThree();
                break;

            case R.id.checkbox_9b:
                doubleCheckedboxesThree();
                break;

            case R.id.checkbox_9c:
                doubleCheckedboxesThree();
                break;

            case R.id.checkbox_9d:
                doubleCheckedboxesThree();
                break;
        }
    }
    private void doubleCheckedboxesThree(){
        CheckBox thirdCB1 = findViewById(R.id.checkbox_9a);//wrong answer
        CheckBox thirdCB2 = findViewById(R.id.checkbox_9b);//correct answer
        CheckBox thirdCB3 = findViewById(R.id.checkbox_9c);//wrong answer
        CheckBox thirdCB4 = findViewById(R.id.checkbox_9d);//correct answer

        boolean correctAnswer = thirdCB2.isChecked() && thirdCB4.isChecked();
        boolean wrongAnswer = thirdCB1.isChecked() || thirdCB3.isChecked();

        if (correctAnswer && !wrongAnswer){
            scoreNine =+ 1;
        }else {
            scoreNine = 0;
        }
    }
    //End of Question Nine
    private void questionOne(){
        RadioButton buttonOne = findViewById(R.id.button_1c);//the answer
        RadioButton buttonTwo = findViewById(R.id.button_1a);
        RadioButton buttonThree = findViewById(R.id.button_1b);
        RadioButton buttonFour = findViewById(R.id.button_1d);

        if (buttonTwo.isChecked()){
            buttonTwo.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans1 = findViewById(R.id.answer1);
            ans1.setText(getResources().getString(R.string.ans1));
            ans1.setVisibility(View.VISIBLE);
            ans1.setBackground(getResources().getDrawable(R.drawable.hidden_textview));

        }else if (buttonThree.isChecked()){
            buttonThree.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans1 = findViewById(R.id.answer1);
            ans1.setText(getResources().getString(R.string.ans1));
            ans1.setVisibility(View.VISIBLE);
            ans1.setBackground(getResources().getDrawable(R.drawable.hidden_textview));

        }else if (buttonFour.isChecked()){
            buttonFour.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans1 = findViewById(R.id.answer1);
            ans1.setText(getResources().getString(R.string.ans1));
            ans1.setVisibility(View.VISIBLE);
            ans1.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
    }

    private void questionTwo(){
        RadioButton buttonOne = findViewById(R.id.button_2a);//the answer
        RadioButton buttonTwo = findViewById(R.id.button_2b);
        RadioButton buttonThree = findViewById(R.id.button_2c);
        RadioButton buttonFour = findViewById(R.id.button_2d);

        if (buttonTwo.isChecked()){
            buttonTwo.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans2 = findViewById(R.id.answer2);
            ans2.setText(getResources().getString(R.string.ans2));
            ans2.setVisibility(View.VISIBLE);
            ans2.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (buttonThree.isChecked()){
            buttonThree.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans2 = findViewById(R.id.answer2);
            ans2.setText(getResources().getString(R.string.ans2));
            ans2.setVisibility(View.VISIBLE);
            ans2.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (buttonFour.isChecked()){
            buttonFour.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans2 = findViewById(R.id.answer2);
            ans2.setText(getResources().getString(R.string.ans2));
            ans2.setVisibility(View.VISIBLE);
            ans2.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
    }

    private void questionThree(){
        RadioButton buttonOne = findViewById(R.id.button_3b);//the answer
        RadioButton buttonTwo = findViewById(R.id.button_3a);
        RadioButton buttonThree = findViewById(R.id.button_3c);
        RadioButton buttonFour = findViewById(R.id.button_3d);

        if (buttonTwo.isChecked()){
            buttonTwo.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans3 = findViewById(R.id.answerThree);
            ans3.setText(getResources().getString(R.string.ans3));
            ans3.setVisibility(View.VISIBLE);
            ans3.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (buttonThree.isChecked()){
            buttonThree.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans3 = findViewById(R.id.answerThree);
            ans3.setText(getResources().getString(R.string.ans3));
            ans3.setVisibility(View.VISIBLE);
            ans3.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (buttonFour.isChecked()){
            buttonFour.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans3 = findViewById(R.id.answerThree);
            ans3.setText(getResources().getString(R.string.ans3));
            ans3.setVisibility(View.VISIBLE);
            ans3.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
    }

    private void questionFour(){
        RadioButton buttonOne = findViewById(R.id.button_4b);//the answer
        RadioButton buttonTwo = findViewById(R.id.button_4a);
        RadioButton buttonThree = findViewById(R.id.button_4c);
        RadioButton buttonFour = findViewById(R.id.button_4d);

        if (buttonTwo.isChecked()){
            buttonTwo.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans4 = findViewById(R.id.answer4);
            ans4.setText(getResources().getString(R.string.ans4));
            ans4.setVisibility(View.VISIBLE);
            ans4.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (buttonThree.isChecked()){
            buttonThree.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans4 = findViewById(R.id.answer4);
            ans4.setText(getResources().getString(R.string.ans4));
            ans4.setVisibility(View.VISIBLE);
            ans4.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (buttonFour.isChecked()){
            buttonFour.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans4 = findViewById(R.id.answer4);
            ans4.setText(getResources().getString(R.string.ans4));
            ans4.setVisibility(View.VISIBLE);
            ans4.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
    }

    private void questionFive(){
        CheckBox buttonOne = findViewById(R.id.checkbox_5a);
        CheckBox buttonTwo = findViewById(R.id.checkbox_5b);
        CheckBox buttonThree = findViewById(R.id.checkbox_5c);
        CheckBox buttonFour = findViewById(R.id.checkbox_5d);

        boolean wrongOne = buttonOne.isChecked();
        boolean wrongTwo = buttonThree.isChecked();

        if (wrongOne) {
            buttonThree.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans5 = findViewById(R.id.answer5);
            ans5.setText(getResources().getString(R.string.ans5));
            ans5.setVisibility(View.VISIBLE);
            ans5.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }

        if (wrongTwo) {
            buttonFour.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans5 = findViewById(R.id.answer5);
            ans5.setText(getResources().getString(R.string.ans5));
            ans5.setVisibility(View.VISIBLE);
            ans5.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }

        boolean a = buttonTwo.isChecked() && buttonFour.isChecked();
        boolean b = a && wrongOne;
        boolean c = a && wrongTwo;

        boolean x = buttonTwo.isChecked() && buttonThree.isChecked() && buttonFour.isChecked();
        boolean y = buttonOne.isChecked();
        boolean m = buttonOne.isChecked() && buttonThree.isChecked() && buttonFour.isChecked();
        boolean n = buttonTwo.isChecked();

        if (b || c){
            TextView ans5 = findViewById(R.id.answer5);
            ans5.setText(getResources().getString(R.string.ans5));
            ans5.setVisibility(View.VISIBLE);
            ans5.setBackground(getResources().getDrawable(R.drawable.hidden_textview));

        }else if (!x && y){
            TextView ans5 = findViewById(R.id.answer5);
            ans5.setText(getResources().getString(R.string.ans5));
            ans5.setVisibility(View.VISIBLE);
            ans5.setBackground(getResources().getDrawable(R.drawable.hidden_textview));

        }else if (!m && n){
            TextView ans5 = findViewById(R.id.answer5);
            ans5.setText(getResources().getString(R.string.ans5));
            ans5.setVisibility(View.VISIBLE);
            ans5.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }

        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
    }



    private void questionSix(){
        TextInputEditText textAnswer = findViewById(R.id.editText);
        String myAnswer = textAnswer.getText().toString();
        String evaporation = "Evaporation";

        if (myAnswer.trim().equalsIgnoreCase(evaporation)){
            scoreSix =+ 1;
        }else {
            TextView ans6 = findViewById(R.id.answer6);
            ans6.setText(getResources().getString(R.string.ans6));
            ans6.setVisibility(View.VISIBLE);
            ans6.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        textAnswer.setEnabled(false);
    }



    private void questionSeven(){
        CheckBox buttonOne = findViewById(R.id.checkbox_7a);
        CheckBox buttonTwo = findViewById(R.id.checkbox_7b);
        CheckBox buttonThree = findViewById(R.id.checkbox_7c);
        CheckBox buttonFour = findViewById(R.id.checkbox_7d);

        boolean wrongOne = buttonOne.isChecked();
        boolean wrongTwo = buttonThree.isChecked();

        if (wrongOne) {
            buttonThree.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans7 = findViewById(R.id.answer7);
            ans7.setText(getResources().getString(R.string.ans7));
            ans7.setVisibility(View.VISIBLE);
            ans7.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }

        if (wrongTwo) {
            buttonFour.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans7 = findViewById(R.id.answer7);
            ans7.setText(getResources().getString(R.string.ans7));
            ans7.setVisibility(View.VISIBLE);
            ans7.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }

        boolean a = buttonTwo.isChecked() && buttonFour.isChecked();
        boolean b = a && wrongOne;
        boolean c = a && wrongTwo;

        boolean x = buttonTwo.isChecked() && buttonThree.isChecked() && buttonFour.isChecked();
        boolean y = buttonOne.isChecked();
        boolean m = buttonOne.isChecked() && buttonThree.isChecked() && buttonFour.isChecked();
        boolean n = buttonTwo.isChecked();

        if (b || c){
            TextView ans7 = findViewById(R.id.answer7);
            ans7.setText(getResources().getString(R.string.ans7));
            ans7.setVisibility(View.VISIBLE);
            ans7.setBackground(getResources().getDrawable(R.drawable.hidden_textview));

        }else if (!x && y){
            TextView ans7 = findViewById(R.id.answer7);
            ans7.setText(getResources().getString(R.string.ans7));
            ans7.setVisibility(View.VISIBLE);
            ans7.setBackground(getResources().getDrawable(R.drawable.hidden_textview));

        }else if (!m && n){
            TextView ans7 = findViewById(R.id.answer7);
            ans7.setText(getResources().getString(R.string.ans7));
            ans7.setVisibility(View.VISIBLE);
            ans7.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }

        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
    }


    private void questionEight(){
        TextInputEditText textAnswerTwo = findViewById(R.id.editTextTwo);
        String myAnswerTwo = textAnswerTwo.getText().toString();
        String element = "Element";

        if (myAnswerTwo.trim().equalsIgnoreCase(element)){
            scoreEight =+ 1;
        }else {
            TextView ans8 = findViewById(R.id.answer8);
            ans8.setText(getResources().getString(R.string.ans8));
            ans8.setVisibility(View.VISIBLE);
            ans8.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        textAnswerTwo.setEnabled(false);
    }



    private void questionNine(){
        CheckBox buttonOne = findViewById(R.id.checkbox_9a);
        CheckBox buttonTwo = findViewById(R.id.checkbox_9b);
        CheckBox buttonThree = findViewById(R.id.checkbox_9c);
        CheckBox buttonFour = findViewById(R.id.checkbox_9d);

        boolean wrongOne = buttonOne.isChecked();
        boolean wrongTwo = buttonThree.isChecked();

        if (wrongOne) {
            buttonThree.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans9 = findViewById(R.id.answer9);
            ans9.setText(getResources().getString(R.string.ans9));
            ans9.setVisibility(View.VISIBLE);
            ans9.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }

        if (wrongTwo) {
            buttonFour.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans9 = findViewById(R.id.answer9);
            ans9.setText(getResources().getString(R.string.ans9));
            ans9.setVisibility(View.VISIBLE);
            ans9.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }

        boolean a = buttonTwo.isChecked() && buttonFour.isChecked();
        boolean b = a && wrongOne;
        boolean c = a && wrongTwo;

        boolean x = buttonTwo.isChecked() && buttonThree.isChecked() && buttonFour.isChecked();
        boolean y = buttonOne.isChecked();
        boolean m = buttonOne.isChecked() && buttonThree.isChecked() && buttonFour.isChecked();
        boolean n = buttonTwo.isChecked();

        if (b || c){
            TextView ans9 = findViewById(R.id.answer9);
            ans9.setText(getResources().getString(R.string.ans9));
            ans9.setVisibility(View.VISIBLE);
            ans9.setBackground(getResources().getDrawable(R.drawable.hidden_textview));

        }else if (!x && y){
            TextView ans9 = findViewById(R.id.answer9);
            ans9.setText(getResources().getString(R.string.ans9));
            ans9.setVisibility(View.VISIBLE);
            ans9.setBackground(getResources().getDrawable(R.drawable.hidden_textview));

        }else if (!m && n){
            TextView ans9 = findViewById(R.id.answer9);
            ans9.setText(getResources().getString(R.string.ans9));
            ans9.setVisibility(View.VISIBLE);
            ans9.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }

        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
    }

    private void questionTen(){
        TextInputEditText textAnswerThree = findViewById(R.id.editTextThree);
        String myAnswerThree = textAnswerThree.getText().toString();
        String acid = "Acid";

        if (myAnswerThree.trim().equalsIgnoreCase(acid)){
            scoreTen =+ 1;
        }else {
            TextView ans10 = findViewById(R.id.answer10);
            ans10.setText(getResources().getString(R.string.ans10));
            ans10.setVisibility(View.VISIBLE);
            ans10.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        textAnswerThree.setEnabled(false);
    }

    public void submitButton(View view){
        //errors
        RadioGroup rg1 = findViewById(R.id.rg1);
        RadioGroup rg2 = findViewById(R.id.rg2);
        RadioGroup rg3 = findViewById(R.id.rg3);
        RadioGroup rg4 = findViewById(R.id.rg4);

        TextInputEditText textAnswer = findViewById(R.id.editText);

        TextInputEditText textAnswerTwo = findViewById(R.id.editTextTwo);

        TextInputEditText textAnswerThree = findViewById(R.id.editTextThree);

        CheckBox CB1 = findViewById(R.id.checkbox_5a);
        CheckBox CB2 = findViewById(R.id.checkbox_5b);
        CheckBox CB3 = findViewById(R.id.checkbox_5c);
        CheckBox CB4 = findViewById(R.id.checkbox_5d);
        boolean checked = CB1.isChecked() || CB2.isChecked() || CB3.isChecked() || CB4.isChecked(); //at least one checkbox is checked

        CheckBox secondCB1 = findViewById(R.id.checkbox_7a);
        CheckBox secondCB2 = findViewById(R.id.checkbox_7b);
        CheckBox secondCB3 = findViewById(R.id.checkbox_7c);
        CheckBox secondCB4 = findViewById(R.id.checkbox_7d);
        boolean checkedTwo = secondCB1.isChecked() || secondCB2.isChecked() || secondCB3.isChecked() || secondCB4.isChecked();

        CheckBox thirdCB1 = findViewById(R.id.checkbox_9a);
        CheckBox thirdCB2 = findViewById(R.id.checkbox_9b);
        CheckBox thirdCB3 = findViewById(R.id.checkbox_9c);
        CheckBox thirdCB4 = findViewById(R.id.checkbox_9d);
        boolean checkedThree = thirdCB1.isChecked() || thirdCB2.isChecked() || thirdCB3.isChecked() || thirdCB4.isChecked();


        if(rg1.getCheckedRadioButtonId() == -1){
            //if no RadioButton is checked
            Toast.makeText(this, "Question 1 is not answered", Toast.LENGTH_SHORT).show();

        }else if(rg2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 2 is not answered", Toast.LENGTH_SHORT).show();

        }else if(rg3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 3 is not answered", Toast.LENGTH_SHORT).show();

        }else if (rg4.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 4 is not answered", Toast.LENGTH_SHORT).show();

        }else if (!checked){
            Toast.makeText(this, "Question 5 is not answered", Toast.LENGTH_SHORT).show();

        } else if (textAnswer.length() == 0){
            Toast.makeText(this, "Question 6 is not answered", Toast.LENGTH_SHORT).show();

        }else if (!checkedTwo){
            Toast.makeText(this, "Question 7 is not answered", Toast.LENGTH_SHORT).show();

        } else if (textAnswerTwo.length() == 0){
            Toast.makeText(this, "Question 8 is not answered", Toast.LENGTH_SHORT).show();

        }else if (!checkedThree){
            Toast.makeText(this, "Question 9 is not answered", Toast.LENGTH_SHORT).show();

        } else if (textAnswerThree.length() == 0){
            Toast.makeText(this, "Question 10 is not answered", Toast.LENGTH_SHORT).show();

        } else {
            //if at least one RadioButton & checkbox is checked and the editText not empty
            questionOne();
            questionTwo();
            questionThree();
            questionFour();
            questionFive();
            questionSix();
            questionSeven();
            questionEight();
            questionNine();
            questionTen();
            int totalScore = score + scoreTwo + scoreThree + scoreFour + scoreFive + scoreSix + scoreSeven +scoreEight + scoreNine + scoreTen;
            // Toast messages after taking the quizzes.
            if (totalScore <= 4){
                Toast.makeText(this, "Below Average. Try Harder Next Time!", Toast.LENGTH_SHORT).show();
            }else if (totalScore == 5 || totalScore == 6 || totalScore == 7){
                Toast.makeText(this, "Good Result, you can still do better!", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "Excellent result, do not relent!", Toast.LENGTH_SHORT).show();
            }

            //TextView
            TextView results = findViewById(R.id.results);
            results.setText(getResources().getString(R.string.results, totalScore));
            results.setVisibility(View.VISIBLE);
            Toast.makeText(this, "Your Total Score is: " + totalScore, Toast.LENGTH_SHORT).show();

            Button submit = findViewById(R.id.submit_button);
            submit.setVisibility(View.INVISIBLE);
        }
    }
}
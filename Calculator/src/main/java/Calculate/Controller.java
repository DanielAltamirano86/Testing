package Calculate;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

public class Controller {
    public TextField inp1;
    public TextField inp2;
    public Tab add;
    public Label txt;
    public Label result;
    public Tab sub;
    public Tab mult;
    public Tab div;
    public Label add_ans;
    public Label sub_ans;
    public Label prod_ans;
    public Label div_ans;

    String resultText = "";
    int number1 = 0;
    int number2 = 0;

    public void onfunc(ActionEvent actionEvent) {
        String num1 = inp1.getText();
        number1 = Integer.parseInt(num1);


        String num2 = inp2.getText();
        number2 = Integer.parseInt(num2);

        String add = String.valueOf(number1 + number2);
        String sub = String.valueOf(number1 - number2);
        String mul = String.valueOf(number1 * number2);
        String div = String.valueOf(number1 / number2);

        add_ans.setText(add);
        sub_ans.setText(sub);
        prod_ans.setText(mul);
        div_ans.setText(div);

//        public void onadd(Event event) {
//            resultText = String.valueOf(number1 + number2);
//            result.setText(resultText);
//        }
//
//        public void onsub(Event event) {
//            resultText = String.valueOf(number1 - number2);
//            result.setText(resultText);
//        }
//
//        public void onmult(Event event) {
//            resultText = String.valueOf(number1 * number2);
//            result.setText(resultText);
//
//        }

//        public void ondiv(Event event) {
//            resultText = String.valueOf(number1 / number2);
//            result.setText(resultText);
//        }

    }



}

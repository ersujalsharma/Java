import java.awt.*;
public class CheckboxGroupExample {
    CheckboxGroupExample(){
        Frame f =new Frame("CheckBoxGroup Example");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male",cbg,true);
        c1.setBounds(50,100,50,50);
        Checkbox c2 = new Checkbox("Female",cbg,false);
        c2.setBounds(50,150,50,50);
        Checkbox c3 = new Checkbox("Transgender");
        c3.setBounds(50,50,50,50);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String... args){
        new CheckboxGroupExample();
    }
}
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.*;

public class MyFrame {
    private Frame f;
    private Panel p0,p10,p11;
    private TextArea  output0, output1;
    private String FrameTitle = "";
    private Button[] buttons;
    private String inputString = "";
    private String outputString = "";
    private double calResult=0.0;
    private Vector<String> Formula = new Vector<>();
    private int ButtonNumber = 20;
    public static void main(String args[])throws Exception{
        MyFrame ff = new MyFrame();
        ff.bulidFrame();
        ff.buildFormula();
        ff.calculate();
    }

    public void bulidFrame()throws Exception{
        f = new Frame(FrameTitle);
        f.setSize(700,630);
        f.setLayout(null);
        Dimension frameSize = f.getSize();             // 获得窗口大小对象
        Dimension displaySize = Toolkit.getDefaultToolkit().getScreenSize(); // 获得显示器大小对象
        if (frameSize.width > displaySize.width)
            frameSize.width = displaySize.width;           // 窗口的宽度不能大于显示器的宽度

        f.setBackground(Color.cyan);
        f.setResizable(false);
        f.setLocation((displaySize.width - frameSize.width)/2, (displaySize.height - frameSize.height)/2  ); // 设置窗口居中显示器显示

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        Font font = new Font("TimesRoman",Font.BOLD,20);

        Panel p = new Panel();
        p.setLayout(null);
        p.setBackground(Color.BLACK);

        output0 = new TextArea(2,100);
        output0.setSize(700,100);
        output0.setEditable(false);
        output0.setFont(font);

        output1 = new TextArea(2,100);
        output1.setSize(700,100);
        output1.setEditable(false);
        output1.setText("0");
        output1.setFont(font);

        output0.setBounds(0,0,700,100);
        output1.setBounds(0,100,700,100);
        p.add(output0);
        p.add(output1);

        p.setBounds(5,30,700,200);
        f.add(p);

        p0 = new Panel();
        p0.setSize(700,400);
        p0.setLayout(null);

        p0.setBounds(0,230,700,400);
        f.add(p0);

        buttons = new Button[ButtonNumber];
        String[] ButtonsNames = {"0","1","2","3","4","5","6","7","8","9",".","=","+","-","*","/","DEL","CA","(",")"};

        for(int i = 0; i < buttons.length; i++){
            Button b0 = new Button();
            buttons[i] = b0;
            buttons[i].setLabel(ButtonsNames[i]);
            buttons[i].setSize(100,100);
            buttons[i].setFont(font);
            buttons[i].setBackground(Color.gray);
            buttons[i].setForeground(Color.white);
        }
        buttons[11].setForeground(Color.red);

        p10 = new Panel();
        p10.setBackground(Color.red);
        p10.setLayout(new GridLayout(4,3));
        p10.add(buttons[7]);
        p10.add(buttons[8]);
        p10.add(buttons[9]);
        p10.add(buttons[4]);
        p10.add(buttons[5]);
        p10.add(buttons[6]);
        p10.add(buttons[1]);
        p10.add(buttons[2]);
        p10.add(buttons[3]);
        p10.add(buttons[10]);
        p10.add(buttons[0]);
        p10.add(buttons[11]);

        p11 = new Panel();
        p11.setBackground(Color.green);
        p11.setLayout(new GridLayout(4,2));
        p11.add(buttons[12]);
        p11.add(buttons[13]);
        p11.add(buttons[14]);
        p11.add(buttons[15]);
        p11.add(buttons[16]);
        p11.add(buttons[17]);
        p11.add(buttons[18]);
        p11.add(buttons[19]);

        p10.setBounds(0,0,300,400);
        p0.add(p10);
        p11.setBounds(500,0,200,400);
        p0.add(p11);
        f.setVisible(true);
    }

    public void buildFormula() throws Exception{
        //what buttons do
        buttons[0].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[0].getLabel());
                output0.setText(inputString);
                Formula.add(buttons[0].getLabel());
            }
        });

        buttons[1].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[1].getLabel());
                output0.setText(inputString);
                Formula.add(buttons[1].getLabel());
            }
        });

        buttons[2].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[2].getLabel());
                output0.setText(inputString);
                Formula.add(buttons[2].getLabel());
            }
        });

        buttons[3].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[3].getLabel());
                output0.setText(inputString);
                Formula.add(buttons[3].getLabel());
            }
        });

        buttons[4].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[4].getLabel());
                output0.setText(inputString);
                Formula.add(buttons[4].getLabel());
            }
        });

        buttons[5].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[5].getLabel());
                output0.setText(inputString);
                Formula.add(buttons[5].getLabel());
            }
        });

        buttons[6].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[6].getLabel());
                output0.setText(inputString);
                Formula.add(buttons[6].getLabel());
            }
        });

        buttons[7].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[7].getLabel());
                output0.setText(inputString);
                Formula.add(buttons[7].getLabel());
            }
        });

        buttons[8].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[8].getLabel());
                output0.setText(inputString);
                Formula.add(buttons[8].getLabel());
            }
        });

        buttons[9].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[9].getLabel());
                output0.setText(inputString);
                Formula.add(buttons[9].getLabel());
            }
        });

        buttons[10].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[10].getLabel());
                output0.setText(inputString);
                Formula.add(buttons[10].getLabel());
            }
        });

        buttons[12].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[12].getLabel());
                output0.setText(inputString);
                Formula.add("+");
            }
        });

        buttons[13].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[13].getLabel());
                output0.setText(inputString);
                Formula.add("-");
            }
        });

        buttons[14].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[14].getLabel());
                output0.setText(inputString);
                Formula.add("*");
            }
        });

        buttons[15].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[15].getLabel());
                output0.setText(inputString);
                Formula.add("/");
            }
        });

        buttons[16].addMouseListener(new MouseAdapter() { //"DEL"
            @Override
            public void mouseClicked(MouseEvent e) throws IndexOutOfBoundsException{
                super.mouseClicked(e);
                if(!inputString.isEmpty()){
                    inputString = inputString.substring(0,inputString.length()-1);
                }

                output0.setText(inputString);
                if(!Formula.isEmpty()){
                    Formula.remove(Formula.size()-1);
                }
            }
        });

        buttons[17].addMouseListener(new MouseAdapter() { //"CA"
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString = "";
                output0.setText(inputString);
                output1.setText("0");
                Formula.clear();
            }
        });

        buttons[18].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[18].getLabel());
                output0.setText(inputString);
                Formula.add("(");
            }
        });

        buttons[19].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                inputString+=(buttons[19].getLabel());
                output0.setText(inputString);
                Formula.add(")");
            }
        });

    }

    public static boolean isNumber(String str){
        switch (str){
            case "+":
                return false;
            case "-":
                return false;
            case "*":
                return false;
            case "/":
                return false;
            case ".":
                return false;
            case "(":
                return false;
            case ")":
                return false;
            default:
                return true;
        }
    }

    public static int opraterNo(String str){
        switch (str){
            case "+":
                return 4;
            case "-":
                return 3;
            case "*":
                return 2;
            case "/":
                return 1;
            case ".":
                return 0;
            case "(":
                return 5;
            case ")":
                return 6;
            default:
                return 7;
        }
    }

    public double calculateab(String a, String b, String oprater) throws Exception{
        switch (oprater){
            case "+":
                return Double.valueOf(a)+Double.valueOf(b);
            case "-":
                return Double.valueOf(a)-Double.valueOf(b);
            case "*":
                return Double.valueOf(a)*Double.valueOf(b);
            case "/":
                return Double.valueOf(a)/Double.valueOf(b);
            default:
                return 0;
        }
    }

    public static Vector<String> processFormula(Vector formula){

        Vector<String> formulaProcessed = new Vector<>();
        Iterator it = formula.iterator();
        Vector<String> vector1 = new Vector<>();

        while (it.hasNext()){
            String str = (String)it.next();
            if(isNumber(str)){
                vector1.add(str);
            }else {
                String string = "";
                Iterator itt = vector1.iterator();
                while (itt.hasNext()){
                    String strr = (String)itt.next();
                    string += strr;
                }
                vector1.clear();
                if (string != "")
                    formulaProcessed.add(string);
                formulaProcessed.add(str);
            }
        }
        if(!vector1.isEmpty()){
            String string1 = "";
            Iterator itt = vector1.iterator();
            while (itt.hasNext()){
                String strr1 = (String)itt.next();
                string1 += strr1;
            }
            if(string1 != "")
                formulaProcessed.add(string1);
        }
        return formulaProcessed;
    }

    public void calculate() throws Exception{
        buttons[11].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                try {
                    int COUNT = 0;
                    //中缀转后缀
                    Vector<String> opraterVector = new Vector<>();
                    Vector<String> backVector = new Vector<>();
                    Iterator it = processFormula(Formula).iterator();

                    while (it.hasNext()){
                        String str = (String)it.next();
                        if(isNumber(str)){
                            backVector.add(str);
                        }else {
                            if (opraterNo(str) == 5)
                                COUNT++;
                            if( opraterVector.isEmpty()){
                                opraterVector.add(str);
                            }else if(opraterNo(str) == 5|| ( opraterNo(str) < opraterNo(opraterVector.lastElement()) ) ){
                                opraterVector.add(str);
                            }
                            else{
                                while (!opraterVector.isEmpty()){
                                    backVector.add(opraterVector.lastElement());
                                    opraterVector.remove(opraterVector.size()-1);
                                }
                                opraterVector.add(str);
                            }
                        }
                    }

                    while (!opraterVector.isEmpty()){
                        backVector.add(opraterVector.lastElement());
                        opraterVector.remove(opraterVector.size()-1);
                    }


                    //backVector 去掉括号
                    while (COUNT > 0){
                        backVector.remove("(");
                        backVector.remove(")");
                        COUNT--;
                    }

                    //计算后缀  backVector

                    Vector<String> process = new Vector<>();
                    Iterator iterator = backVector.iterator();

                    while (iterator.hasNext()){
                        String processStr = (String)iterator.next();

                        if(isNumber(processStr)){
                            process.add(processStr);
                        }else {
                            String a = process.lastElement();
                            process.remove(process.size()-1);
                            String b = process.lastElement();
                            process.remove(process.size()-1);

                            double calResult1 = 0;
                            try {
                                calResult1 = calculateab(b,a,processStr);
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }
                            process.add(Double.toString(calResult1));
                        }
                    }
                    if(!process.isEmpty())
                        calResult = Double.valueOf(process.lastElement());

                    if(calResult != 0.0){
                        outputString = Double.toString(calResult);
                    }else {
                        outputString = "0";
                    }
                    output1.setText(outputString);
                    inputString = "";
                    Formula.clear();
                }catch (Exception el){
                    outputString = "Error, please try again";
                    output1.setText(outputString);
                    inputString = "";
                    Formula.clear();
                }finally {}

            }
        });
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ui_VM {
    private JTextPane textQueue;
    private JButton buttonBeli;
    private JLabel labelHasil;
    private JPanel Panel;
    private JButton buttonKurang;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel harga1;
    private JLabel harga2;
    private JLabel harga3;
    private JLabel harga4;
    private JLabel harga5;
    private JLabel harga6;
    private JLabel harga7;
    private JLabel harga8;
    private JLabel harga9;


    listProduk list = new listProduk();
    listMinuman minuman = new listMinuman(4);
    hargaMinuman harga = new hargaMinuman(4);
    void setMinuman(int m){
        list.setMinuman(m);
        minuman.pushList(list.getNama());
        harga.pushHarga(list.getHarga());
    }
    String getMinuman(){
        return (minuman.printStack());
    }

    void setText(){
        String space = "";
        for(int i = minuman.top; i <= minuman.data.length-1; i++){
            space = space + "\n";
        }
        textQueue.setText(getMinuman() + space + "Total Harga: Rp. "+harga.total()+",-");
    }

    void tambahMinuman(int inputIndex){
        if(minuman.isFull()){
            JOptionPane.showMessageDialog(new JFrame(), "Anda hanya dapat membeli barang maksimum 4",
                                        "List sudah penuh", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            setMinuman(inputIndex);
            setText();
            /*for(int i = minuman.top; i <= minuman.data.length-1; i++){
                space = space + "\n";
            }
            textQueue.setText(getMinuman() + space + "Total Harga: Rp. "+harga.total()+",-");*/
            //System.out.println(harga.printStack());
        }

    }
    void kurangMinuman(){
        minuman.popList();
        harga.popHarga();
        setText();
        if(minuman.isEmpty()){
            textQueue.setText("list Kosong");
        }
        //textQueue.setText(getMinuman());
    }
    void beliMinuman(){
        if(minuman.isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Anda belum menambahkan barang apapun",
                    "List Kosong", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //System.out.println(harga.total());
            JOptionPane.showMessageDialog(new JFrame(), "Anda membeli " + (minuman.top+1) + " barang seharga Rp. "
                            + harga.total() + ",- terima kasih telah membeli",
                    "Pembelian", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public Ui_VM() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tambahMinuman(1);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tambahMinuman(2);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tambahMinuman(3);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tambahMinuman(4);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tambahMinuman(5);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tambahMinuman(6);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tambahMinuman(7);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tambahMinuman(8);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tambahMinuman(9);
            }
        });
        buttonKurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                kurangMinuman();
            }
        });
        buttonBeli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                beliMinuman();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Vending machine GUI");
        frame.setContentPane(new Ui_VM().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 768);
        frame.setResizable(true);
    }
}
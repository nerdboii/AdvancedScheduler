package View;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TaskView extends JPanel {

    public JLabel durationLabel;
    public JLabel nameLabel;
    public TaskView(int x, int y, int width, int height, String duration, String name) {
        this.durationLabel = new JLabel(duration);
        this.nameLabel = new JLabel(name);
        this.setBounds(x, y, width, height);
        this.setVisible(true);
        addListener();
    }
    public void addListener() {
        public class DoubleClickExample {
            private Timer timer = null;
            private final int DOUBLE_CLICK_TIME_DELTA = 300; // thời gian tối đa giữa hai lần click (tính bằng milliseconds)

            public DoubleClickExample() {
                JFrame frame = new JFrame("Double Click Example");
                JButton button = new JButton("Double Click Me!");

                button.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (timer != null) {
                            timer.cancel(); // Hủy timer cũ nếu đã tồn tại
                        }
                        timer = new Timer();
                        timer.schedule(new TimerTask() {
                            @Override
                            public void run() {
                                // Nếu không có click thứ hai, timer sẽ chạy và reset biến isDoubleClick
                                timer = null;
                            }
                        }, DOUBLE_CLICK_TIME_DELTA);

                        if (e.getClickCount() == 2 && timer != null) {
                            System.out.println("Double clicked!");
                            timer.cancel();
                            timer = null;
                        }
                    }
                });

                frame.add(button);
                frame.setSize(300, 200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }

            public static void main(String[] args) {
                new DoubleClickExample();
            }
        }
    }
}

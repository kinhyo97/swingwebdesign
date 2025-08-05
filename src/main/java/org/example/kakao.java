package org.example;

import javax.swing.*;
import java.awt.*;

public class kakao extends JFrame {

    public kakao() {
        setTitle("SwingWebDesign 연습");
        setSize(1858, 959); // 작업 사이즈
        setLocationRelativeTo(null); // 화면 가운데 정렬
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // 상단/중앙/하단 나누기 쉬운 레이아웃

        // 상단바
        JPanel topBar = new JPanel();
        topBar.setPreferredSize(new Dimension(1858, 93));
        topBar.setBackground(Color.PINK);
        topBar.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JLabel logo = new JLabel("로고자리");
        logo.setFont(new Font("맑은 고딕", Font.BOLD, 24));
        topBar.add(logo);
        add(topBar, BorderLayout.NORTH);

        // 좌우 패널
        JPanel westPanel = createFixedPanel(new Dimension(264, 959), Color.PINK);
        JPanel eastPanel = createFixedPanel(new Dimension(264, 959), Color.PINK);
        add(eastPanel, BorderLayout.EAST);
        add(westPanel, BorderLayout.WEST);

        // 중앙 패널
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(Color.DARK_GRAY);
        add(centerPanel, BorderLayout.CENTER);

        // 메인 컨테이너
        JPanel mainContainer = createFixedPanel(new Dimension(1097, 623), Color.RED);
        mainContainer.setLayout(new BoxLayout(mainContainer, BoxLayout.X_AXIS));
        mainContainer.setAlignmentX(Component.CENTER_ALIGNMENT);

        // 메인 카드
        JPanel mainCard = createFixedPanel(new Dimension(1097, 623), Color.YELLOW);
        mainCard.setLayout(new BoxLayout(mainCard, BoxLayout.X_AXIS));
        mainCard.setAlignmentY(Component.TOP_ALIGNMENT);
        mainContainer.add(mainCard);

        // 오른쪽 카드 컨테이너
        JPanel rightmainCardContainer = createFixedPanel(new Dimension(207, 623), Color.GRAY);
        rightmainCardContainer.setLayout(new BoxLayout(rightmainCardContainer, BoxLayout.Y_AXIS));
        rightmainCardContainer.setAlignmentY(Component.TOP_ALIGNMENT);

        // 각각의 카드
        JPanel rightmainCard = createFixedPanel(new Dimension(207, 207), Color.GREEN);
        rightmainCard.setLayout(new BoxLayout(rightmainCard, BoxLayout.Y_AXIS));

        JPanel rightmainCard2 = createFixedPanel(new Dimension(207, 207), Color.GREEN);
        rightmainCard2.setLayout(new BoxLayout(rightmainCard2, BoxLayout.Y_AXIS));

        JPanel rightmainCard3 = createFixedPanel(new Dimension(207, 168), Color.GREEN);
        rightmainCard3.setLayout(new BoxLayout(rightmainCard3, BoxLayout.Y_AXIS));

        JPanel mainLabelContainer = new JPanel();
        mainLabelContainer.setLayout(new BorderLayout());
        mainLabelContainer.setBackground(Color.CYAN);
        mainLabelContainer.setMaximumSize(new Dimension(1330, 100));

        JLabel kakaoLabel = new JLabel("카카오와 카카오 그룹이 축적해 온 이야기들");
        kakaoLabel.setFont(new Font("맑은 고딕", Font.BOLD, 36));
        kakaoLabel.setForeground(Color.BLACK);
        mainLabelContainer.add(kakaoLabel, BorderLayout.WEST);






        // 카드들 배치
        mainContainer.add(Box.createRigidArea(new Dimension(20, 0)));
        mainContainer.add(rightmainCardContainer);
        rightmainCardContainer.add(rightmainCard);
        rightmainCardContainer.add(Box.createRigidArea(new Dimension(0, 20)));
        rightmainCardContainer.add(rightmainCard2);
        rightmainCardContainer.add(Box.createRigidArea(new Dimension(0, 20)));
        rightmainCardContainer.add(rightmainCard3);

        // 중앙 패널에 추가
        centerPanel.add(mainContainer);
        centerPanel.add(createSpacerBox(130));
        centerPanel.add(mainLabelContainer);
    }

    private JPanel createFixedPanel(Dimension size, Color color) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(size);
        panel.setMaximumSize(size);
        panel.setBackground(color);
        return panel;
    }

    private Component createSpacerBox(int height) {
        JComponent box = (JComponent) Box.createRigidArea(new Dimension(1330, height));
        box.setBackground(Color.BLUE);
        box.setOpaque(true);
        return box;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new kakao().setVisible(true);
        });
    }
}

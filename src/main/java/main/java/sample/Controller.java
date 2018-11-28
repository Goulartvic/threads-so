package main.java.sample;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Controller {

    @FXML
    private Rectangle square0;
    @FXML
    private Rectangle square1;
    @FXML
    private Rectangle square2;
    @FXML
    private Rectangle square3;
    @FXML
    private Rectangle square4;
    @FXML
    private Rectangle square5;
    @FXML
    private Rectangle square6;
    @FXML
    private Rectangle square7;
    @FXML
    private Rectangle square8;
    @FXML
    private Rectangle square9;
    @FXML
    private Rectangle square10;
    @FXML
    private Rectangle square11;
    @FXML
    private Rectangle square12;
    @FXML
    private Rectangle square13;
    @FXML
    private Rectangle square14;
    @FXML
    private Rectangle square15;
    @FXML
    private Rectangle square16;
    @FXML
    private Rectangle square17;
    @FXML
    private Rectangle square18;
    @FXML
    private Rectangle square19;
    @FXML
    private Rectangle square20;
    @FXML
    private Rectangle square21;
    @FXML
    private Rectangle square22;
    @FXML
    private Rectangle square23;
    @FXML
    private Rectangle square24;
    @FXML
    private Rectangle square25;
    @FXML
    private Rectangle square26;
    @FXML
    private Rectangle square27;
    @FXML
    private Rectangle square28;
    @FXML
    private Rectangle square29;
    @FXML
    private Rectangle square30;
    @FXML
    private Rectangle square31;
    @FXML
    private Rectangle square32;
    @FXML
    private Rectangle square33;
    @FXML
    private Rectangle square34;
    @FXML
    private Rectangle square35;
    @FXML
    private Rectangle square36;
    @FXML
    private Rectangle square37;
    @FXML
    private Rectangle square38;
    @FXML
    private Rectangle square39;
    @FXML
    private Rectangle square40;
    @FXML
    private Rectangle square41;
    @FXML
    private Rectangle square42;
    @FXML
    private Rectangle square43;
    @FXML
    private Rectangle square44;
    @FXML
    private Rectangle square45;
    @FXML
    private Rectangle square46;
    @FXML
    private Rectangle square47;
    @FXML
    private Rectangle square48;
    @FXML
    private Rectangle square49;
    @FXML
    private Rectangle square50;
    @FXML
    private Rectangle square51;
    @FXML
    private Rectangle square52;
    @FXML
    private Rectangle square53;
    @FXML
    private Rectangle square54;
    @FXML
    private Rectangle square55;
    @FXML
    private Rectangle square56;
    @FXML
    private Rectangle square57;
    @FXML
    private Rectangle square58;
    @FXML
    private Rectangle square59;
    @FXML
    private Rectangle square60;
    @FXML
    private Rectangle square61;
    @FXML
    private Rectangle square62;
    @FXML
    private Rectangle square63;
    @FXML
    private Rectangle square64;
    @FXML
    private Rectangle square65;
    @FXML
    private Rectangle square66;
    @FXML
    private Rectangle square67;
    @FXML
    private Rectangle square68;
    @FXML
    private Rectangle square69;
    @FXML
    private Rectangle square70;
    @FXML
    private Rectangle square71;
    @FXML
    private Rectangle square72;
    @FXML
    private Rectangle square73;
    @FXML
    private Rectangle square74;
    @FXML
    private Rectangle square75;
    @FXML
    private Rectangle square76;
    @FXML
    private Rectangle square77;
    @FXML
    private Rectangle square78;
    @FXML
    private Rectangle square79;
    @FXML
    private Rectangle square80;
    @FXML
    private Rectangle square81;
    @FXML
    private Rectangle square82;
    @FXML
    private Rectangle square83;
    @FXML
    private Rectangle square84;
    @FXML
    private Rectangle square85;
    @FXML
    private Rectangle square86;
    @FXML
    private Rectangle square87;
    @FXML
    private Rectangle square88;
    @FXML
    private Rectangle square89;
    @FXML
    private Rectangle square90;
    @FXML
    private Rectangle square91;
    @FXML
    private Rectangle square92;
    @FXML
    private Rectangle square93;
    @FXML
    private Rectangle square94;
    @FXML
    private Rectangle square95;
    @FXML
    private Rectangle square96;
    @FXML
    private Rectangle square97;
    @FXML
    private Rectangle square98;
    @FXML
    private Rectangle square99;

//    Future future0;
//    Future future1;
//    Future future2;
//    Future future3;
//    Future future4;
//

    @FXML
    private AnchorPane anchorPane;

    @FXML
    public synchronized void easyGameAction() {
//        setOnClickListener();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i<5; i++) {
            executor.execute(easyGame());
//            switch (i) {
//                case 0: {
//                    future0 = executor.submit(easyGame());
//                    break;
//                }
//                case 1: {
//                    future1 = executor.submit(easyGame());
//                }
//                case 2: {
//                    future2 = executor.submit(easyGame());
//                    break;
//                }
//                case 3: {
//                    future3 = executor.submit(easyGame());
//                    break;
//                }
//                case 4: {
//                    future4 = executor.submit(easyGame());
//                    break;
//                }
//            }
        }
        executor.shutdown();
    }

    @FXML
    public synchronized void mediumGameAction() {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i<5; i++) {
            executor.execute(mediumGame());}
        executor.shutdown();
    }

    @FXML
    public synchronized void hardGameAction() {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i<5; i++) {
            executor.execute(hardGame());}
        executor.shutdown();
    }

//    private void setOnClickListener() {
//        List<Rectangle> rectangles = rectangleList();
//        square0.setOnMouseClicked(event -> {
//        });
//    }

    public Runnable easyGame() {
        Random random = new Random();
        final Instant[] now = {Instant.now()};
        Instant maxTime = now[0].plusSeconds(300);
        return () -> {
            while (now[0].isBefore(maxTime)) {
                int sort = random.nextInt(60);
                List<Rectangle> rectangles = Controller.this.rectangleList();
                Rectangle rectangle = rectangles.get(sort);
                if (rectangle.getFill() == Color.DODGERBLUE) {
                    rectangle.setFill(Color.BLACK);
                    System.out.println("pintado");
                    Controller.this.sleep(2000);
                    System.out.println("acordado");
                    Controller.this.cleanSquare(sort, rectangles);
                    System.out.println("limpo");
                } else System.out.printf("mesma posição");
                now[0] = Instant.now();
            }
        };
    }

    public Runnable mediumGame() {
        Random random = new Random();
        final Instant[] now = {Instant.now()};
        Instant maxTime = now[0].plusSeconds(50);
        return () -> {
            while (now[0].isBefore(maxTime)) {
                int sort = random.nextInt(100);
                List<Rectangle> rectangles = Controller.this.rectangleList();
                Rectangle rectangle = rectangles.get(sort);
                if (rectangle.getFill() == Color.DODGERBLUE) {
                    rectangle.setFill(Color.BLACK);
                    System.out.println("pintado");
                    Controller.this.sleep(1500);
                    System.out.println("acordado");
                    Controller.this.cleanSquare(sort, rectangles);
                    System.out.println("limpo");
                } else System.out.printf("mesma posição");
                now[0] = Instant.now();
            }
        };
    }

    public Runnable hardGame() {
        Random random = new Random();
        final Instant[] now = {Instant.now()};
        Instant maxTime = now[0].plusSeconds(40);
        return () -> {
            while (now[0].isBefore(maxTime)) {
                int sort = random.nextInt(100);
                List<Rectangle> rectangles = Controller.this.rectangleList();
                Rectangle rectangle = rectangles.get(sort);
                if (rectangle.getFill() == Color.DODGERBLUE) {
                    rectangle.setFill(Color.BLACK);
                    System.out.println("pintado");
                    Controller.this.sleep(1000);
                    System.out.println("acordado");
                    Controller.this.cleanSquare(sort, rectangles);
                    System.out.println("limpo");
                } else System.out.printf("mesma posição");
                now[0] = Instant.now();
            }
        };
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
            System.out.println("dormindo");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cleanSquare(int position, List<Rectangle> rectangles) {
        Rectangle rectangle = rectangles.get(position);
        rectangle.setFill(Color.DODGERBLUE);
    }

    public List<Rectangle> rectangleList() {
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(square0);
        rectangles.add(square1);
        rectangles.add(square2);
        rectangles.add(square3);
        rectangles.add(square4);
        rectangles.add(square5);
        rectangles.add(square6);
        rectangles.add(square7);
        rectangles.add(square8);
        rectangles.add(square9);
        rectangles.add(square10);
        rectangles.add(square11);
        rectangles.add(square12);
        rectangles.add(square13);
        rectangles.add(square14);
        rectangles.add(square15);
        rectangles.add(square16);
        rectangles.add(square17);
        rectangles.add(square18);
        rectangles.add(square19);
        rectangles.add(square20);
        rectangles.add(square21);
        rectangles.add(square22);
        rectangles.add(square23);
        rectangles.add(square24);
        rectangles.add(square25);
        rectangles.add(square26);
        rectangles.add(square27);
        rectangles.add(square28);
        rectangles.add(square29);
        rectangles.add(square30);
        rectangles.add(square31);
        rectangles.add(square32);
        rectangles.add(square33);
        rectangles.add(square34);
        rectangles.add(square35);
        rectangles.add(square36);
        rectangles.add(square37);
        rectangles.add(square38);
        rectangles.add(square39);
        rectangles.add(square40);
        rectangles.add(square41);
        rectangles.add(square42);
        rectangles.add(square43);
        rectangles.add(square44);
        rectangles.add(square45);
        rectangles.add(square46);
        rectangles.add(square47);
        rectangles.add(square48);
        rectangles.add(square49);
        rectangles.add(square50);
        rectangles.add(square51);
        rectangles.add(square52);
        rectangles.add(square53);
        rectangles.add(square54);
        rectangles.add(square55);
        rectangles.add(square56);
        rectangles.add(square57);
        rectangles.add(square58);
        rectangles.add(square59);
        rectangles.add(square60);
        rectangles.add(square61);
        rectangles.add(square62);
        rectangles.add(square63);
        rectangles.add(square64);
        rectangles.add(square65);
        rectangles.add(square66);
        rectangles.add(square67);
        rectangles.add(square68);
        rectangles.add(square69);
        rectangles.add(square70);
        rectangles.add(square71);
        rectangles.add(square72);
        rectangles.add(square73);
        rectangles.add(square74);
        rectangles.add(square75);
        rectangles.add(square76);
        rectangles.add(square77);
        rectangles.add(square78);
        rectangles.add(square79);
        rectangles.add(square80);
        rectangles.add(square81);
        rectangles.add(square82);
        rectangles.add(square83);
        rectangles.add(square84);
        rectangles.add(square85);
        rectangles.add(square86);
        rectangles.add(square87);
        rectangles.add(square88);
        rectangles.add(square89);
        rectangles.add(square90);
        rectangles.add(square91);
        rectangles.add(square92);
        rectangles.add(square93);
        rectangles.add(square94);
        rectangles.add(square95);
        rectangles.add(square96);
        rectangles.add(square97);
        rectangles.add(square98);
        rectangles.add(square99);
        return rectangles;
    }
}

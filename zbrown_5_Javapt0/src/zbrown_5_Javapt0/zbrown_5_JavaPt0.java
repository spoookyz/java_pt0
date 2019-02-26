/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zbrown_5_Javapt0;

/**
 *
 * @author zoe
 */
public class zbrown_5_JavaPt0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        lion larry = new lion("Larry", 10, 12);
        System.out.println("Hi, I'm Larry the lion, I am " + larry.age + ", my claws are " + larry.claws + " centimeters long, I am a " + larry.emotion + " out of 10 on a mentally stable scale.");

        for (int i = 0; i < 12; i++) {

        }

    }
}

class lion {

    String name;
    int age;
    int claws;
    int emotion;

    public lion(String a, int b, int c) {
        this.name = a;
        this.age = b;
        this.claws = c;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getClaws() {
        return claws;
    }

    public int getEmotion() {
        return emotion;
    }

}

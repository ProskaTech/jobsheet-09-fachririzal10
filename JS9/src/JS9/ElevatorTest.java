/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JS9;

/**
 *
 * @author Fachri
 */
public class ElevatorTest {
    public static void main(String[] args) {
        Elevator myElevator = new Elevator();
        myElevator.OpenDoor();
        myElevator.closeDoor();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.OpenDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.OpenDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.setFloor(myElevator.TOP_FLOOR);
        myElevator.OpenDoor();
    } 
} 

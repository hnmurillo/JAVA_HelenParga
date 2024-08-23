/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

/**
 *
 * @author win10
 */
public class house {
     private room room;
    
    public house(){
        this.room = new room();
    }

    public room getRoom() {
        return room;
    }

    public void setRoom(room room) {
        this.room = room;
    }
    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Write a description of class sting_bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sting_bee extends Actor
{
    /**
     * Act - do whatever the sting_bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Pergerakkan actor dengan database ada dalam actor ini
        control();
        
    }
    // ini adalah codingan untuk membuat gerakan pada bee
    public void control()
    {
        if(Greenfoot.isKeyDown("a")){setLocation(getX() - 5, getY());
    }
        if(Greenfoot.isKeyDown("d")){setLocation(getX() + 5, getY());
    }
        if(Greenfoot.isKeyDown("w")){setLocation(getX(), getY() - 5);
    }
        if(Greenfoot.isKeyDown("s")){setLocation(getX(), getY() + 5);
    }
    }
    // Codingan berikut ini adalah untuk menyambungkan greenfoot dengan database
    static Connection con() {
    try {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/grft_algo";
        Class.forName(driver);
        
        return DriverManager.getConnection(url,"root", "");
    } catch (Exception e) {
        System.out.println("Connection failed !" + e);
    }
    return null;
    }
    public void dbbeemove() {
    Connection con=con();
    try {
        String query = "SELECT * from hotkey";
        PreparedStatement pst=con.prepareStatement(query);
	ResultSet rs = pst.executeQuery();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Tentu saja untuk membuat gerakan yang dikendalikan database,
// kita perlu mengimport beberapa library java seperti berikut.
// 

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        showText("nilai dalam Database :", 400,370);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        sting_bee sting_bee = new sting_bee();
        addObject(sting_bee,75,85);
    }
}

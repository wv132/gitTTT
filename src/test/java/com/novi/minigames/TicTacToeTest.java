/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novi.minigames;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jvr
 */
public class TicTacToeTest {
    
    public TicTacToeTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Play method, of class TicTacToe.
     */
    @org.junit.jupiter.api.Test
    public void testPlay() {
        System.out.println("Play");
        TicTacToe instance = new TicTacToe();
        instance.Play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createBoard method, of class TicTacToe.
     */
    @org.junit.jupiter.api.Test
    public void testCreateBoard() {
        System.out.println("createBoard");
        TicTacToe instance = new TicTacToe();
        instance.createBoard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printBoard method, of class TicTacToe.
     */
    @org.junit.jupiter.api.Test
    public void testPrintBoard() {
        System.out.println("printBoard");
        TicTacToe instance = new TicTacToe();
        instance.printBoard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

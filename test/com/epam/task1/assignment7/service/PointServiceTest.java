package com.epam.task1.assignment7.service;

import com.epam.mathem.entity.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointServiceTest {
  @Test
  public void findClosesPointTest(){
    Point expected = new Point(1, 20);
    Point point1 = new Point(9, 8);
    com.epam.mathem.service.PointService service = new com.epam.mathem.service.PointService();
    Point actual = service.findClosesPoint(point1, expected);
    assertSame(actual, expected);
  }

}
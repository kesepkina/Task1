package com.epam.mathem.service;

import com.epam.mathem.entity.Point;

public class PointService {
  public Point findClosesPoint(Point point1, Point point2) {
    double distance1 = Math.hypot(point1.getX(), point1.getY());
    double distance2 = Math.hypot(point2.getX(), point2.getY());
//    if(distance1 > distance2) {
//      return point2;
//    } else {
//      return point1;
//    }
    return distance1 > distance2 ? point2 : point1;
  }
}

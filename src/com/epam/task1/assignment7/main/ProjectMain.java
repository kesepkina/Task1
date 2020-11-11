package com.epam.mathem.main;

import com.epam.mathem.entity.Point;
import com.epam.mathem.report.PointReport;
import com.epam.mathem.service.PointService;

public class ProjectMain {
  public static void main(String[] args) {
    Point point = new Point(1, 2);
    Point point1 = new Point(9, 8);
    PointService service = new PointService();
    Point res = service.findClosesPoint(point1, point);
    PointReport report = new PointReport();
    report.closesPoint(res);
  }
}

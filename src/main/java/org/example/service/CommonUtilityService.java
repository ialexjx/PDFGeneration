package org.example.service;

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.UnitValue;


public class CommonUtilityService {

    private static CommonUtilityService INSTANCE;

    public static CommonUtilityService getInstance() {
        if (INSTANCE == null){
            INSTANCE = new CommonUtilityService();
        }
        return INSTANCE;
    }
    public void addSpacer(Document document, float height) {
        Table spacerTable = new Table(UnitValue.createPercentArray(1)).useAllAvailableWidth();
        Cell spacerCell = new Cell().setHeight(height).setBackgroundColor(new DeviceRgb(204, 255, 247));
        spacerTable.addCell(spacerCell);
        document.add(spacerTable);
    }
}

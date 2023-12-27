package Homework_nr_8;

public class Invoice {
    String modelOfDevice;
    String descriptionOfDevice;
    int countSellsDevice;
    double priceOfDevice;

    public Invoice(String modelOfDevice, String descriptionOfDevice, int countSellsDevice, double priceOfDevice) {
        this.modelOfDevice = modelOfDevice;
        this.descriptionOfDevice = descriptionOfDevice;
        this.countSellsDevice = countSellsDevice;
        this.priceOfDevice = priceOfDevice;
    }

    public String getModelOfDevice() {
        return modelOfDevice;
    }

    public void setModelOfDevice(String modelOfDevice) {
        this.modelOfDevice = modelOfDevice;
    }

    public String getDescriptionOfDevice() {
        return descriptionOfDevice;
    }

    public void setDescriptionOfDevice(String descriptionOfDevice) {
        this.descriptionOfDevice = descriptionOfDevice;
    }

    public int getCountSellsDevice() {
        return countSellsDevice;
    }

    public void setCountSellsDevice(int countSellsDevice) {
        this.countSellsDevice = countSellsDevice;
    }

    public double getPriceOfDevice() {
        return priceOfDevice;
    }

    public void setPriceOfDevice(double priceOfDevice) {
        this.priceOfDevice = priceOfDevice;
    }

    public void devicePurchaseAccount(){
        System.out.println("Model of the device is" + modelOfDevice + "Description of the device is" + descriptionOfDevice
        + "Count of sells device is " + countSellsDevice + "Price of Device is " + priceOfDevice);

    }

    public void getAmount(){
        if (priceOfDevice < 0) {
            System.out.println(priceOfDevice = 0);
        }else {
            System.out.println(priceOfDevice);
        }
        if (countSellsDevice < 0) {
            System.out.println(countSellsDevice = 0);
        }else {
            System.out.println(countSellsDevice);
        }
    }


}

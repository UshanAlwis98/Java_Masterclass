public class Car {

        private String make = "Toyota";
        private String model;

        private int doors;
        private int passengers;

        private boolean convertible;
        private  double engineCapacity;


        public String getMake(){
            return make;
        }

        public  void setMake(String mid){
            this.make=mid;
        }

        public int getDoors() {
                return doors;
        }

        public void setDoors(int doorParameter) {
                this.doors = doorParameter;
        }
}

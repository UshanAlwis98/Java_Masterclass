

    public class CoffeeCup {
        private String size;
        private String flavor;

        public CoffeeCup(String size, String flavor) {
            this.size = size;
            this.flavor = flavor;
        }

        public String getSize() {
            return size;
        }

        public String getFlavor() {
            return flavor;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setFlavor(String flavor) {
            this.flavor = flavor;
        }

        public void printDetails(String label) {
            System.out.println(label + ": " + size + " - " + flavor);
        }
    }



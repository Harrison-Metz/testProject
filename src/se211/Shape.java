package se211;

    public class Shape {
        private final int numberOfSides;

        public Shape(int numberOfSides) {
            if (numberOfSides < 3 || numberOfSides == Integer.MAX_VALUE) {
                throw new IllegalArgumentException();
            }
            this.numberOfSides = numberOfSides;
        }

        public int numberOfSides() {
            return numberOfSides;
        }

        public String description() {
            switch (numberOfSides) {
                case 3:
                    return "SE321.Triangle";
                case 4:
                    return "Square";
                case 5:
                    return "Pentagon";
                default:
                    return "Shape with " + numberOfSides + " sides";
            }
        }
        public void show(){
            System.out.println("This is a shape");
        }

    }


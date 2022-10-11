
         public class Rowboat extends Boat{
            public void rowTheBoat() {
                System.out.print("stroke natasha");
            }
        }
        class Boat {
        private int length;
        public void setLength(int len) {
            length = len;
        }
        public int getLength(){
            return length;
        }

        public void move() {
            System.out.print("drift");
        }
            
        } 

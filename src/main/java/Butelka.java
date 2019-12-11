public class Butelka {


        private double ileLitrow;
        private double pojemnosc;

        Butelka(double ileLitrow, double pojemnosc){

            this.ileLitrow = ileLitrow;
            this.pojemnosc = pojemnosc;

        }

        double getIleLitrow(){
            return ileLitrow;
        }

        double getPojemnosc() {
            return pojemnosc;
        }


        void wlej(double ileWlac) {

            if (getPojemnosc() < ileWlac)
                System.out.println("chcesz wlać: "+ileWlac+" to więcej niż wynosi pojemność tej butelki: "+pojemnosc);


            if ((getIleLitrow()+ileWlac) > getPojemnosc())
                System.out.println("chcesz wlać: "+(getIleLitrow()+ileWlac)+ " to więcej niż wynosi pojemność tej butelki: "+pojemnosc);

            else
                this.ileLitrow += ileWlac;


        }

        void wylej(double ileWylac) {

            if (ileWylac > getIleLitrow())
                System.out.println("chcesz wylać "+ileWylac+" to więcej niż jest aktualnie w butelce: "+getIleLitrow());

            else
                this.ileLitrow -= ileWylac;

        }


        public void przelej (double ilePrzelac, Butelka gdziePrzelac) {

            if ((gdziePrzelac.getPojemnosc() - gdziePrzelac.getIleLitrow()) < ilePrzelac)
                System.out.println("w butelce jest miejsce na: "+(gdziePrzelac.getPojemnosc() - gdziePrzelac.getIleLitrow())+" przepełnisz przelewając "+ilePrzelac);

            else
                wylej(ilePrzelac);


            if (ilePrzelac <= (gdziePrzelac.getPojemnosc() - gdziePrzelac.getIleLitrow()) )

                gdziePrzelac.wlej(ilePrzelac);


            //else
            //System.out.println("nie przelewam! ilość przelewana "+ilePrzelać+ " przepełni butelkę! ");

        }
        public static void main(String[] args) {

            Butelka[] butelka = new Butelka [3];

            butelka[0]  = new Butelka(100, 300);
            butelka[1]  = new Butelka(100, 200);
            butelka[2]  = new Butelka(100, 300);

            //butelka[0].wlej(301);

				/*butelka[0].wylej(50);

				butelka[0].wlej(100);

				butelka[0].wlej(5);

				butelka[0].wylej(20);

				butelka[0].wylej(505);

				butelka[0].wlej(20);

				butelka[0].wlej(145); */


				/*butelka[1].wylej(301);

				butelka[1].wylej(50);

				butelka[1].wlej(100);

				butelka[1].wlej(5);

				butelka[1].wylej(20);

				butelka[1].wylej(505);

				butelka[1].wlej(20);

				butelka[1].wlej(5);*/


				/*butelka[2].wylej(301);

				butelka[2].wylej(50);

				butelka[2].wlej(100);

				butelka[2].wlej(5);

				butelka[2].wylej(20);

				butelka[2].wylej(505);

				butelka[2].wlej(20);

				butelka[2].wlej(5);*/


            butelka[0].przelej(40, butelka[2]);

            butelka[1].przelej(100, butelka[0]);

            butelka[2].przelej(40, butelka[1]);


            System.out.println("stan: "+butelka[0].getIleLitrow()+" Pojemność max: "+butelka[0].getPojemnosc());
            System.out.println("stan: "+butelka[1].getIleLitrow()+" Pojemność max: "+butelka[1].getPojemnosc());
            System.out.println("stan: "+butelka[2].getIleLitrow()+" Pojemność max: "+butelka[2].getPojemnosc());




        }


    }



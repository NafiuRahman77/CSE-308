public class Adapter {
    Akash a;
    PayFren p;
    DHarai d;

    public Akash getA() {
        return a;
    }

    public void setA(Akash a) {
        this.a = a;
    }

    public PayFren getP() {
        return p;
    }

    public void setP(PayFren p) {
        this.p = p;
    }

    public DHarai getD() {
        return d;
    }

    public void setD(DHarai d) {
        this.d = d;
    }

    public void transfer(MoneySystem m1, MoneySystem m2, int amount){
        if(m1.getClass().getName()=="Akash" && m2.getClass().getName()=="Akash"){

            if(m1.getBalance()-amount<0){
                System.out.println("NID"+m1.getNo()+" Insufficient balance to send");
            }
            else {
                m1.send(amount);
                m2.receive(amount);
                System.out.println("NID" + m1.getNo() + ": Sending " + amount + "taka to NID" + m2.getNo());
                System.out.println("NID" + m2.getNo() + ": Received " + amount + "taka from NID" + m1.getNo());
            }
            System.out.println();
        }
        if(m1.getClass().getName()=="PayFren" && m2.getClass().getName()=="Akash"){

            if(m1.getBalance()-amount<0){
                System.out.println("SSN"+m1.getNo()+" Insufficient balance to send");
            }
            else {
                m1.send(amount);
                m2.receive(amount*100);
                System.out.println("SSN" + m1.getNo() + ": Sending " + amount + "dollars to NID" + m2.getNo());

                System.out.println("NID" + m2.getNo() + ": Received " + amount * 100 + "taka from SSN" + m1.getNo());
                System.out.println();
            }
        }
        if(m1.getClass().getName()=="DHarai" && m2.getClass().getName()=="Akash"){

            if(m1.getBalance()-amount<0){
                System.out.println("kojin"+m1.getNo()+" Insufficient balance to send");
            }
            else {
                m1.send(amount);
                m2.receive(amount/2);
                System.out.println();
                System.out.println("kojin" + m1.getNo() + ": Sending " + amount + "yen to NID" + m2.getNo());

                System.out.println("NID" + m2.getNo() + ": Received " + amount / 20 + "yen from kojin" + m1.getNo());
            }
        }
        if(m1.getClass().getName()=="Akash" && m2.getClass().getName()=="PayFren"){


            if(m1.getBalance()-amount<0){
                System.out.println("NID"+m1.getNo()+" Insufficient balance to send");
            }
            else {
                m1.send(amount);
                m2.receive((amount/100));
                System.out.println();
                System.out.println("NID" + m1.getNo() + ": Sending " + amount + "taka to SSN" + m2.getNo());
                System.out.println("SSN" + m2.getNo() + ": Received " + amount / 100 + "dollars from NID" + m1.getNo());
            }

        }
        if(m1.getClass().getName()=="Akash" && m2.getClass().getName()=="Dharai"){

            System.out.println();
            if(m1.getBalance()-amount<0){
                System.out.println("NID"+m1.getNo()+" Insufficient balance to send");
            }
            else {
                m1.send(amount);
                m2.receive(amount*2);
                System.out.println("NID" + m1.getNo() + ": Sending " + amount + "taka to kojin" + m2.getNo());
                System.out.println("SSN" + m2.getNo() + ": Received " + amount * 2 + "yen from NID" + m1.getNo());
            }
        }


    }


}

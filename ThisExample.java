class ThisExample {
    int num;

    ThisExample(int num) {
        this.num = num; 
    }

    void display() {
        System.out.println("Number: " + this.num);
    }

public static void main(String[] args) {
        ThisExample obj = new ThisExample(10);
        obj.display();
    }
}

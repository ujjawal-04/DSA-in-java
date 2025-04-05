public class patterns {

public void pattern1(int n) {
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

public void pattern2(int n) {
    for(int i=0;i<n;i++) {
        for(int j=0;j<=i;j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

public void pattern3(int n) {
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=i;j++) {
                System.out.print(j);
        }
        System.out.println();
    }
}
public void pattern4(int n) {
    for(int i=0;i<=n;i++) {
        for(int j=1;j<=i;j++) {
                System.out.print(i);
        }
        System.out.println();
    }
}
public void pattern5(int n) {
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=i;j++) {
                System.out.print(j);
        }
        System.out.println();
    }
}

public static void main(String[] args) {
    patterns p = new patterns();
    p.pattern1(5);
    p.pattern2(5);  
    p.pattern3(5); 
    p.pattern4(5); 
    p.pattern5(5);
}
}
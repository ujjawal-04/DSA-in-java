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
        for(int j=1;j<=n-i+1;j++) {
                System.out.print("* ");
        }
        System.out.println();
    }
}

public void pattern6(int n) {
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=n-i+1;j++) {
                System.out.print(j );
        }
        System.out.println();
    }
}

public void pattern7(int n) {
    for(int i=0;i<n;i++) {
        for(int j=0;j<=n-i-1;j++) {
                System.out.print(" ");
        }
        for(int j=1;j<=2*i+1;j++) {
            System.out.print("*");
       }
        for(int j=0;j<=n-i-1;j++) {
            System.out.print(" ");
     }
        System.out.println();
    }
}

public void pattern8(int n) {
    for(int i=0;i<=n;i++) {
        for(int j=0;j<=i;j++) {
                System.out.print(" ");
        }
        for(int j=1;j<=2*n-(2*i+1);j++) {
            System.out.print("*");
       }
        for(int j=1;j<=i;j++) {
            System.out.print(" ");
     }
        System.out.println();
    }
}

public void pattern9(int n) {
    for(int i=0;i<n;i++) {
        for(int j=0;j<=n-i-1;j++) {
                System.out.print(" ");
        }
        for(int j=1;j<=2*i+1;j++) {
            System.out.print("*");
       }
        for(int j=0;j<=n-i-1;j++) {
            System.out.print(" ");
     }
        System.out.println();
    }
    for(int i=0;i<=n;i++) {
        for(int j=0;j<=i;j++) {
                System.out.print(" ");
        }
        for(int j=1;j<=2*n-(2*i+1);j++) {
            System.out.print("*");
       }
        for(int j=1;j<=i;j++) {
            System.out.print(" ");
     }
        System.out.println();
    }
}

public void pattern10(int n) {
    for(int i=1;i<=2*n-1;i++) {
        int stars = i;
        if(i>n) stars=2*n-i;
        for(int j=1 ;j<=stars;j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

public void print11(int n) {
    int start =1;
    for(int i=0;i<n;i++) {
        if(i%2==0) {
            start=1;
        } else {
            start=0;
        }
        for(int j=0;j<=i;j++) {
           System.out.print(start);
           start = 1- start;
        }
        System.out.println();
    }
}

public void pattern12(int n) {
    int space = 2*(n-1);
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=i;j++) {
                System.out.print(j);
        }
        for(int j=1;j<=space;j++) {
            System.out.print(" ");
       }
        for(int j=i;j>=1;j--) {
            System.out.print(j);
     }
        System.out.println();
        space -= 2;
    }
}

public void print13(int n) {
    int num=1;
for(int i=1;i<=n;i++) {
	for(int j=1 ;j<=i;j++) {
		System.out.print(num);
		num=num + 1;
	}
	System.out.println();
}
}

public void print14(int n) {
for(int i=0;i<n;i++) {
	for(char ch='A' ;ch<='A'+i;ch++) {
		System.out.print(ch);
	}
	System.out.println();
}
}

public void print15(int n) {
    for(int i=0;i<n;i++) {
        for(char ch='A' ;ch<='A'+(n-i-1);ch++) {
            System.out.print(ch);
        }
        System.out.println();
}
}

public void print16(int n) {
    for(int i=0;i<n;i++) {
        char ch = (char) ('A' + i);
        for(int j=0;j<=i;j++) {
            System.out.print(ch);
        }
        System.out.println();
}
}

public void print17(int n) {
    for(int i=0;i<n;i++) {
        for(int j=0;j<n-i-1;j++) {
            System.out.print(" ");
        }
        char ch = 'A';
        int bp = (2*i+1)/2;
        for(int j=1;j<=2*i+1;j++) {
            System.out.print(ch);
            if(j<=bp)
            ch++;
            else ch--;
        }
        for(int j=0;j<n-i-1;j++) {
           System.out.print(" ");
        }
        System.out.println();
    }
}

public void print18(int n) {
    for(int i=0;i<n;i++) {
        for(char ch=(char)('E'-i);ch<='E';ch++) {
             System.out.print(ch);
        }
        System.out.println();
    }
}

public void print19(int n) {
    int iniS = 0;
    for(int i=0;i<n;i++) {
        for(int j=1 ;j<=n-i;j++) {
            System.out.print("*");
        }
        for(int j=0;j<=iniS;j++) {
            System.out.print(" ");
        }
        for(int j=1 ;j<=n-i;j++) {
            System.out.print("*");
        }
        System.out.println();
        iniS+=2;
    }
    iniS=8;
    for(int i=1;i<=n;i++) {
        for(int j=1 ;j<=i;j++) {
            System.out.print("*");
        }
        for(int j=0;j<=iniS;j++) {
            System.out.print(" ");
        }
        for(int j=1 ;j<=i;j++) {
            System.out.print("*");
        }
        iniS-=2;
        System.out.println();
    }
}

public void print20(int n) {
    int spaces = 2 * n - 2;
    for (int i = 1; i <= 2 * n - 1; i++) {
        int stars = i;
        if (i > n) stars = 2 * n - i;
        for (int j = 1; j <= stars; j++) {
            System.out.print("*");
        }
        for (int j = 1; j <= spaces; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= stars; j++) {
            System.out.print("*");
        }
        System.out.println(); 
        if (i < n) spaces -= 2;
        else spaces += 2;
    }
}

public void print21(int n) {
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(i==0 || j==0 || i==n-1||j==n-1) {
                System.out.print("*");
            }
            else System.out.print(" ");
        }	
        System.out.println();
}
}

public void print22(int n) {
    int size = 2 * n - 1;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            int min = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
            System.out.print((n - min) + " ");
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
    p.pattern6(5);
    p.pattern7(5);
    p.pattern8(5);
    p.pattern9(5);
    p.pattern10(5);
    p.print11(5);
    p.pattern12(5);
    p.print13(5);
    p.print14(5);
    p.print15(5);
    p.print16(5);
    p.print17(5);
    p.print18(5);
    p.print19(5);
    p.print20(5);
    p.print21(5);
    p.print22(5);
}
}
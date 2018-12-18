package ArmenIskandaryan.Lesson_01;

public class Homework_01 {
    static int a = 4;
    static int b = 2;
    static int c = 1;
    static int d = 1;
    static int k = 200;
    static boolean t = false;

    static boolean example1() {
        if(a == b) {
            t = true;
        }
        System.out.println("Result = " + t);
        return t;
    }

    static boolean example2() {
        if(a > b) {
            t = true;
        }
        System.out.println("Result = " + t);
        return t;
    }

    static boolean example3() {
        if(a < b) {
            t = true;
        }
        System.out.println("Result = " + t);
        return t;
    }

    static void example4() {
        if(a > b) {
            if(a > c) {
                System.out.println("The maximum number is: " + a);
            } else {
                System.out.println("The maximum number is: " + c);
            }
        } else {
            if(b > c) {
                System.out.println("The maximum number is: " + b);
            } else {
                System.out.println("The maximum number is: " + c);
            }
        }
    }

    static void example5() {
        if(a < b) {
            if(a < c) {
                System.out.println("The minimum number is: " + a);
            } else {
                System.out.println("The minimum number is: " + c);
            }
        } else {
            if(b < c) {
                System.out.println("The minimum number is: " + b);
            } else {
                System.out.println("The minimum number is: " + c);
            }
        }
    }

    static boolean example6(){
        if(a + b > k) {
            t = true;
            System.out.println(a + " + " + b + " is greather than " + t);
        } else {
            System.out.println(a + " + " + b + " is less than " + t);
        }
        return t;
    }

    static boolean example7(){
        if(a + b < k) {
            t = true;
            System.out.println(a + " + " + b + " is less than " + t);
        } else {
            System.out.println(a + " + " + b + " is greather than " + t);
        }
        return t;
    }

    static void example8() {
        if (a < b) {
            if (a < c) {
                System.out.println(a);
                if (b < c) {
                    System.out.println(b);
                    System.out.println(c);
                } else {
                    System.out.println(c);
                    System.out.println(b);
                }
            } else {
                if (c < b) {
                    System.out.println(c);
                    if (a < b) {
                        System.out.println(a);
                        System.out.println(b);
                    } else {
                        System.out.println(b);
                        System.out.println(a);
                    }
                } else {
                    System.out.println(b);
                    if (a < c) {
                        System.out.println(a);
                        System.out.println(c);
                    } else {
                        System.out.println(c);
                        System.out.println(a);
                    }
                }
            }
        } else {
            if (b < c) {
                System.out.println(b);
                if (a < c) {
                    System.out.println(a);
                    System.out.println(c);
                } else {
                    System.out.println(c);
                    System.out.println(a);
                }
            } else {
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }
        }
    }

    static void example9() {
        if (a > b) {
            if (a > c) {
                System.out.println(a);
                if (b > c) {
                    System.out.println(b);
                    System.out.println(c);
                } else {
                    System.out.println(c);
                    System.out.println(b);
                }
            } else {
                if (c > b) {
                    System.out.println(c);
                    if (a > b) {
                        System.out.println(a);
                        System.out.println(b);
                    } else {
                        System.out.println(b);
                        System.out.println(a);
                    }
                } else {
                    System.out.println(b);
                    if (a > c) {
                        System.out.println(a);
                        System.out.println(c);
                    } else {
                        System.out.println(c);
                        System.out.println(a);
                    }
                }
            }
        } else {
            if (b > c) {
                System.out.println(b);
                if (a > c) {
                    System.out.println(a);
                    System.out.println(c);
                } else {
                    System.out.println(c);
                    System.out.println(a);
                }
            } else {
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }
        }
    }

    static void example10() {
        if (a < b) {
            if (a < c) {
                if (b < c) {
                    if (c < k) {
                        System.out.println(a);
                    }
                } else {
                    if (b < k) {
                        System.out.println(a);
                    }
                }
            } else {
                if (c < b) {
                    if (a < b) {
                        if (b < k) {
                            System.out.println(c);
                        }
                    } else {
                        if (a < k) {
                            System.out.println(c);
                        }
                    }
                } else {
                    if (a < c) {
                        if (c < k) {
                            System.out.println(b);
                        }
                    } else {
                        if (a < k) {
                            System.out.println(b);
                        }
                    }
                }
            }
        } else {
            if (b < c) {
                if (a < c) {
                    if (c < k) {
                        System.out.println(b);
                    }
                } else {
                    if (a < k) {
                        System.out.println(b);
                    }
                }
            } else {
                if (a < k) {
                    System.out.println(c);
                }
            }
        }
    }

    public static void main(String[] args) {
        Homework_01.example10();
    }
}

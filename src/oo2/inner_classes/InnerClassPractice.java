package oo2.inner_classes;

class OuterClass {

    int count = 0;

    class MemberInner {
        int a = 10;
    }

    private class PrivateMemberInner {
        int a = 5;
    }
    public void someMethod() {
        class Inner {
            int a = 0;
        }
        OuterClass outer = new OuterClass();
        Inner inner = new Inner();
        System.out.println(inner.a);

        PrivateMemberInner privateMemberInner = new PrivateMemberInner();
        System.out.println(privateMemberInner.a);

        MemberInner memberInner = new MemberInner();
        System.out.println(memberInner.a);

        count += 33;
    }
}

public class InnerClassPractice {

    public static void main(String[] args) {
        OuterClass.MemberInner memberInner = new OuterClass().new MemberInner();
        System.out.println(memberInner.a);

        OuterClass outerClass = new OuterClass();
        OuterClass.MemberInner memberInner2 = outerClass.new MemberInner();
        memberInner2.a += 10;
        System.out.println(memberInner2.a);

//        outerClass.new PrivateMemberInner(); Does not compile (private class only accessible within Outer


        outerClass.someMethod();
    }
}

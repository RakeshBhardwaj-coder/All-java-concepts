package OOPs.Interface;

public  class Person implements Student,Youtuber   {//both student and youtuber is interface then we implements both here.
    public static void main(String[] args) {
        Person o = new Person();//initiation
        o.study();
        o.makeVideo();
        o.uploadVideo();//this is default method not need to override.

        //typecasting referencing the youtuber for use extended interface.
        Youtuber o2 = o;//remember we can't initiate youtuber because it is a interface,
        o2.videoEditing();//we extends videoEdit to youtuber so for use it we have create like this reference.
        o2.makeVideo();
        o2.uploadVideo();//this is default method not need to override.
    }


    @Override
    public void study() {
        System.out.println("Person is studying ");
    }

    @Override
    public void makeVideo() {
        System.out.println("Person is making video");
    }


    @Override
    public void videoEditing() {
        System.out.println("Youtuber is Video Editing");
    }
}

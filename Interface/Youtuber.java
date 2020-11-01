package OOPs.Interface;

public abstract interface Youtuber extends VideoEdit {//we can extends in multi-interfaces.
   void makeVideo();

    default void uploadVideo() {//uploadvideo is new method so we use default and implement this is not
        //compulsory.
        System.out.println("Youtuber is uploading Video");
    }
}

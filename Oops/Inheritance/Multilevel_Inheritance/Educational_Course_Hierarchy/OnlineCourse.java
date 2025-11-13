class OnlineCourse extends Course {
    String platform; boolean isRecorded;
    OnlineCourse(String courseName,int duration,String platform,boolean isRecorded){ super(courseName,duration); this.platform=platform; this.isRecorded=isRecorded; }
    String info(){ return super.info()+", Platform: "+platform+", Recorded: "+isRecorded; }
}
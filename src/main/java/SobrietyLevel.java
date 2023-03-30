public enum SobrietyLevel {
    //
    SOBER(1),
    EUPHORIA(2),
    EXCITEMENT(3),
    CONFUSION(4),
    STUPOR(5);

    private int levelNumber;
    SobrietyLevel(int levelNumber){
        this.levelNumber = levelNumber;
    }

    public int getLevelNumber() {
        return this.levelNumber;
    }


}

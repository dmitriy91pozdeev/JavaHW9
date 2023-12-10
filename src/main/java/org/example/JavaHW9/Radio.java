package org.example.JavaHW9;

public class Radio {
    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation > 9) {
            newCurrentRadioStation = 0;
        }
        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = 9;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        int increase = currentVolume + 1;
        setCurrentVolume(increase);
        int decrease = currentVolume - 1;
        setCurrentRadioStation(decrease);
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        int increase = currentVolume + 1;

        setCurrentVolume(increase);
    }

    //  public void nextStation() {
    //      int next = currentRadioStation + 1;
    //      setCurrentRadioStation(next);
}

//public void prevStation() {
//  int prev = currentRadioStation - 1;
// setCurrentRadioStation(prev);
//}

/// private void increaseVolume() {
////    int increase = currentVolume + 1;

//    setCurrentVolume(increase);
//}

//public void decreaseVolume() {
//   int decrease = currentVolume - 1;
///  setCurrentRadioStation(decrease);


//  public void setIncreaseVolume(int increaseVolume) {
//     this.increaseVolume = increaseVolume;
// }

// public int getIncreaseVolume() {
//  //    return increaseVolume;
///  }
//}

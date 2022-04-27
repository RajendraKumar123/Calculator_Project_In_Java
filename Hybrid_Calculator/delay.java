interface common {
  void run();
}

class delay extends Thread implements common {
  public void run() {

    try {
      Thread.sleep(1500);
    }

    catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}

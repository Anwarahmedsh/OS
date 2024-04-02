public class PCB {
    private int processID;
    private int priority;
    private int arrivalTime;
    private int cpuBurstTime;
    private int startTime;
    private int terminationTime;
    private int turnaroundTime;
    private int waitingTime;
    private int responseTime;

    // Constructor 
    public PCB(processID, priority, arrivalTime, cpuBurst) {
        this.processID = processID;
        this.priority = priority;
        this.arrivalTime = arrivalTime;
        this.cpuBurst = cpuBurst;
        this.startTime = 0; // Initialize to zero, will be updated during scheduling
        this.terminationTime = 0; // Initialize to zero, will be updated during scheduling
        this.turnaroundTime = 0; // Initialize to zero, will be calculated later
        this.waitingTime = 0; // Initialize to zero, will be calculated later
        this.responseTime = 0; // Initialize to zero, will be calculated later
    }

   // Calculate turnaround time
    public void calculateTurnaroundTime() {
        this.turnaroundTime = this.terminationTime - this.arrivalTime;
    }

    // Calculate waiting time
    public void calculateWaitingTime(int startTime) {
        this.waitingTime = startTime - this.arrivalTime;
    }

    // Calculate response time
    public void calculateResponseTime(int startTime) {
        this.responseTime = startTime - this.arrivalTime;
    }
    
       // Setters
    public void setProcessID(int processID) {
        this.processID = processID;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setCpuBurstTime(int cpuBurstTime) {
        this.cpuBurstTime = cpuBurstTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setTerminationTime(int terminationTime) {
        this.terminationTime = terminationTime;
    }
    
    public void setTurnaroundTime(int turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }
    
     public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }
    
    public void setResponseTime(int responseTime) {
        this.responseTime = responseTime;
    }
    
    

    // Getters
    public String getProcessID() {
        return processID;
    }

    public int getPriority() {
        return priority;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getCpuBurstTime() {
        return cpuBurstTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getTerminationTime() {
        return terminationTime;
    }

    public int getTurnaroundTime() {
        return turnaroundTime;
    }


    public int getWaitingTime() {
        return waitingTime;
    }

    public int getResponseTime() {
        return responseTime;
    }

}

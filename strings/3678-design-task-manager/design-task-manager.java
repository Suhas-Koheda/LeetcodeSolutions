class TaskManager {
    PriorityQueue<Task> priority;
    HashMap<Integer, Integer> p;
    HashMap<Integer, Integer> p1;

    public TaskManager(List<List<Integer>> tasks) {
        p = new HashMap<>();
        p1 = new HashMap<>();
        priority = new PriorityQueue<Task>((a, b) -> {
            if (Integer.compare(b.priority, a.priority) == 0) {
                return b.tId - a.tId;
            }
            return b.priority - a.priority;
        });
        for (List<Integer> i : tasks) {
            p.put(i.get(1), i.get(2));
            priority.add(new Task(i.get(0), i.get(1), i.get(2)));
            p1.put(i.get(1), i.get(0));
        }
    }

    public void add(int userId, int taskId, int priority) {
        this.priority.offer(new Task(userId, taskId, priority));
        p.put(taskId, priority);
        p1.put(taskId, userId);
        // System.out.println(p);
        // System.out.println(p1);
        // System.out.println("--------");
    }

    public void edit(int taskId, int newPriority) {
        this.priority.offer(new Task(p1.get(taskId), taskId, newPriority));
        p.put(taskId, newPriority);
        // System.out.println(p);
        // System.out.println(p1);
        // System.out.println("--------");
    }

    public void rmv(int taskId) {
        p.remove(taskId);
        // System.out.println(p);
        // System.out.println(p1);
        // System.out.println("--------");
    }

    public int execTop() {
        while (!priority.isEmpty()) {
            Task t = priority.peek();
            if (p.get(t.tId)!=null && t.priority == p.get(t.tId)) {
                p.remove(t.tId);
                return t.id;
            } else {
                priority.poll();
            }
        }
        return -1;
    }
}

class Task {
    int id;
    int tId;
    int priority;

    public Task(int id, int tId, int priority) {
        this.id = id;
        this.tId = tId;
        this.priority = priority;
    }
}
/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */
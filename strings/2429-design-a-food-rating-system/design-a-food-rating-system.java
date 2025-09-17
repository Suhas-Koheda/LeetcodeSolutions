import java.util.*;

class FoodRatings {
    HashMap<String, TreeMap<FoodKey, Food>> arr = new HashMap<>();
    HashMap<String, String> foo = new HashMap<>();
    HashMap<String, Food> f = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            String cuisine = cuisines[i];
            arr.putIfAbsent(cuisine, new TreeMap<>());
            Food newFood = new Food(foods[i], cuisine, ratings[i]);
            FoodKey key = new FoodKey(ratings[i], foods[i]);
            arr.get(cuisine).put(key, newFood);
            foo.put(foods[i], cuisine);
            f.put(foods[i], newFood);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foo.get(food);
        if (cuisine == null) return;
        TreeMap<FoodKey, Food> map = arr.get(cuisine);
        Food foodObj = f.get(food);
        if (foodObj == null || map == null) return;

        FoodKey oldKey = new FoodKey(foodObj.rating, foodObj.food);
        map.remove(oldKey);
        foodObj.rating = newRating;
        FoodKey newKey = new FoodKey(newRating, foodObj.food);
        map.put(newKey, foodObj);
    }

    public String highestRated(String cuisine) {
        TreeMap<FoodKey, Food> map = arr.get(cuisine);
        if (map != null && !map.isEmpty()) {
            return map.firstEntry().getValue().food;
        }
        return null;
    }
}

class Food {
    String food;
    String cuisine;
    int rating;

    public Food(String food, String cuisine, int rating) {
        this.food = food;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;
        Food other = (Food) o;
        return food.equals(other.food);
    }

    @Override
    public int hashCode() {
        return food.hashCode();
    }
}

class FoodKey implements Comparable<FoodKey> {
    int rating;
    String food;

    public FoodKey(int rating, String food) {
        this.rating = rating;
        this.food = food;
    }

    @Override
    public int compareTo(FoodKey o) {
        if (this.rating != o.rating) {
            return Integer.compare(o.rating, this.rating); 
        }
        return this.food.compareTo(o.food);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodKey)) return false;
        FoodKey other = (FoodKey) o;
        return rating == other.rating && food.equals(other.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rating, food);
    }
}

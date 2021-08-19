package com.example.droidcaffev1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.ViewHolder> {

    private ArrayList<Recipe> recipeData;
    private Context myContext;

    RecipeAdapter(ArrayList<Recipe> mRecipeData, Context context){
        this.myContext = context;
        this.recipeData = mRecipeData;
    }

    @NonNull
    @Override
    public RecipeAdapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(myContext).inflate(R.layout.recipe_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull  RecipeAdapter.ViewHolder holder, int position) {
        Recipe currentRecipe = recipeData.get(position);
        holder.bindTo(currentRecipe);
    }

    @Override
    public int getItemCount() {

        return recipeData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView myRecipeImage;
        private TextView myRecipeTitle;
        private TextView myRecipeDescription;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            myRecipeImage = itemView.findViewById(R.id.recipe_image);
            myRecipeTitle = itemView.findViewById(R.id.recipe_title);
            myRecipeDescription = itemView.findViewById(R.id.recipe_description);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int dessertPosition = getAdapterPosition();
                    Recipe currentDessert = recipeData.get(dessertPosition);
                    if (dessertPosition == 4 ){
                        Intent donutIntent = new Intent(myContext, DonutActivity.class);
                        donutIntent.putExtra("dTitle", currentDessert.getRecipeTitle());
                        donutIntent.putExtra("dImage", currentDessert.getRecipeImage());
                        donutIntent.putExtra("dDescription", currentDessert.getRecipeDescription());
                        myContext.startActivity(donutIntent);
                    }else if (dessertPosition == 0){
                        Intent iceCreamCakeIntent = new Intent(myContext, IceCreamCakeActivity.class);
                        iceCreamCakeIntent.putExtra("iTitle", currentDessert.getRecipeTitle());
                        iceCreamCakeIntent.putExtra("iImage", currentDessert.getRecipeImage());
                        iceCreamCakeIntent.putExtra("iDescription", currentDessert.getRecipeDescription());
                        myContext.startActivity(iceCreamCakeIntent);
                    }else if (dessertPosition == 1){
                        Intent strawberryIntent = new Intent(myContext, StrawberryCakeActivity.class);
                        strawberryIntent.putExtra("sTitle", currentDessert.getRecipeTitle());
                        strawberryIntent.putExtra("sImage", currentDessert.getRecipeImage());
                        strawberryIntent.putExtra("sDescription", currentDessert.getRecipeDescription());
                        myContext.startActivity(strawberryIntent);
                    }else if (dessertPosition == 2){
                        Intent spongeCakeIntent = new Intent(myContext, SpongeCakeActivity.class);
                        spongeCakeIntent.putExtra("spTitle", currentDessert.getRecipeTitle());
                        spongeCakeIntent.putExtra("spImage", currentDessert.getRecipeImage());
                        spongeCakeIntent.putExtra("spDescription", currentDessert.getRecipeDescription());
                        myContext.startActivity(spongeCakeIntent);
                    }else if (dessertPosition == 3){
                        Intent coffeeCakeIntent = new Intent(myContext, CoffeeCakeActivity.class);
                        coffeeCakeIntent.putExtra("cTitle", currentDessert.getRecipeTitle());
                        coffeeCakeIntent.putExtra("cImage", currentDessert.getRecipeImage());
                        coffeeCakeIntent.putExtra("cDescription", currentDessert.getRecipeDescription());
                        myContext.startActivity(coffeeCakeIntent);
                    }else if (dessertPosition == 5){
                        Intent chocolateCakeIntent = new Intent(myContext, ChocolateCakeActivity.class);
                        chocolateCakeIntent.putExtra("chTitle", currentDessert.getRecipeTitle());
                        chocolateCakeIntent.putExtra("chImage", currentDessert.getRecipeImage());
                        chocolateCakeIntent.putExtra("chDescription", currentDessert.getRecipeDescription());
                        myContext.startActivity(chocolateCakeIntent);
                    }else if (dessertPosition == 6){
                        Intent swissRollIntent = new Intent(myContext, SwissRollActivity.class);
                        swissRollIntent.putExtra("swTitle", currentDessert.getRecipeTitle());
                        swissRollIntent.putExtra("swImage", currentDessert.getRecipeImage());
                        swissRollIntent.putExtra("swDescription", currentDessert.getRecipeDescription());
                        myContext.startActivity(swissRollIntent);
                    }else if (dessertPosition == 7){
                        Intent springRollIntent = new Intent(myContext, SpringRollActivity.class);
                        springRollIntent.putExtra("springTitle", currentDessert.getRecipeTitle());
                        springRollIntent.putExtra("springImage", currentDessert.getRecipeImage());
                        springRollIntent.putExtra("springDescription", currentDessert.getRecipeDescription());
                        myContext.startActivity(springRollIntent);
                    }
                    else {
                        Toast.makeText(myContext, "Create an activity for the dessert", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        public void bindTo(Recipe currentRecipe) {
            Glide.with(myContext).load(currentRecipe.getRecipeImage()).into(myRecipeImage);
            myRecipeTitle.setText(currentRecipe.getRecipeTitle());
            myRecipeDescription.setText(currentRecipe.getRecipeDescription());
        }
    }
}

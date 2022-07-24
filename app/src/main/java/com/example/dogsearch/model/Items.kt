package com.example.dogsearch.model

import android.os.Parcelable
import com.example.dogsearch.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class Items(val img: Int, val title: String, val description: String): Parcelable

val dogList = mutableListOf(
    Items(
        R.drawable.afador,
        "afador",
        "The Afador is a mixed breed dog–a cross between the Afghan Hound and Labrador" +
                " Retriever dog breeds. Loyal, energetic, and affectionate, these pups inherited " +
                "some of the best qualities from both of their parents."
    ),
    Items(
        R.drawable.akita,
        "akita",
        "The Akita Pit is a mixed breed dog–a cross between the Akita and American Pit Bull " +
                "Terrier dog breeds. Intelligent, protective, and loyal, these pups inherited some" +
                " of the best traits from both of their parents"
    ),
    Items(
        R.drawable.american_staffodshire,
        "American Staffordshire Terrier",
        "The American Staffordshire Terrier is a muscular breed known for being strong" +
                " for its size; however, they’re also loving and affectionate with human family" +
                " members. American Staffordshire Terriers enjoy nothing more than being with the" +
                " humans they care about, whether they’re out for a jog, playing in the yard, or " +
                "cuddling up on the couch."
    ),
    Items(
        R.drawable.kelpie,
        "Australian Kelpie",
        "The Australian Kelpie was originally bred to have the energy, intelligence," +
                " and independence to herd livestock all day in the hot Australian climate without " +
                "much need for supervision. They retain those qualities to this day."
    ),
    Items(
        R.drawable.australian_shepherd,
        "Australian Shepherd",
        "The Australian Shepherd Lab Mix is a mixed breed dog — a cross between the " +
                "Australian Shepherd and the Labrador Retriever dog breeds. Medium in size, " +
                "energetic, and loyal, these pups inherited some amazing traits from both of" +
                " their parents."
    ),
    Items(
        R.drawable.basset_hound,
        "Basset Hound",
        "The Basset Hound dog breed was bred for hunting small game such as rabbits " +
                "and is still used for this purpose in some parts of the United States. When " +
                "they’re not on the trail of a bunny, they’re laid-back family friends who love kids."
    ),
    Items(
        R.drawable.belgian_tervuren,
        "Belgian Tervuren",
        "Created in Belgium in the late 19th century, the Belgian Tervuren dog breed " +
                "is often considered to be the most elegant of the four Belgian sheepdogs. They’" +
                "re intelligent and athletic, making them a versatile performer in any number of" +
                " activities, including their original job, herding."
    ),
    Items(
        R.drawable.bernese_mountain_dog,
        "Bernese Mountain Dog",
        "The Bernese Mountain Dog is an extremely versatile working dog from the farmlands" +
                " of Switzerland. They were developed to herd cattle, pull carts, and be watchdogs" +
                " and loyal companions. They’re one of four types of Swiss Mountain Dogs, and the " +
                "only one with long hair."
    ),
    Items(
        R.drawable.afador,
        "afador",
        "The Afador is a mixed breed dog–a cross between the Afghan Hound and Labrador" +
                " Retriever dog breeds. Loyal, energetic, and affectionate, these pups inherited " +
                "some of the best qualities from both of their parents."
    ),
    Items(
        R.drawable.akita,
        "akita",
        "The Akita Pit is a mixed breed dog–a cross between the Akita and American Pit Bull " +
                "Terrier dog breeds. Intelligent, protective, and loyal, these pups inherited some" +
                " of the best traits from both of their parents"
    ),
    Items(
        R.drawable.american_staffodshire,
        "American Staffordshire Terrier",
        "The American Staffordshire Terrier is a muscular breed known for being strong" +
                " for its size; however, they’re also loving and affectionate with human family" +
                " members. American Staffordshire Terriers enjoy nothing more than being with the" +
                " humans they care about, whether they’re out for a jog, playing in the yard, or " +
                "cuddling up on the couch."
    ),
    Items(
        R.drawable.kelpie,
        "Australian Kelpie",
        "The Australian Kelpie was originally bred to have the energy, intelligence," +
                " and independence to herd livestock all day in the hot Australian climate without " +
                "much need for supervision. They retain those qualities to this day."
    ),
    Items(
        R.drawable.australian_shepherd,
        "Australian Shepherd",
        "The Australian Shepherd Lab Mix is a mixed breed dog — a cross between the " +
                "Australian Shepherd and the Labrador Retriever dog breeds. Medium in size, " +
                "energetic, and loyal, these pups inherited some amazing traits from both of" +
                " their parents."
    ),
    Items(
        R.drawable.basset_hound,
        "Basset Hound",
        "The Basset Hound dog breed was bred for hunting small game such as rabbits " +
                "and is still used for this purpose in some parts of the United States. When " +
                "they’re not on the trail of a bunny, they’re laid-back family friends who love kids."
    ),
    Items(
        R.drawable.belgian_tervuren,
        "Belgian Tervuren",
        "Created in Belgium in the late 19th century, the Belgian Tervuren dog breed " +
                "is often considered to be the most elegant of the four Belgian sheepdogs. They’" +
                "re intelligent and athletic, making them a versatile performer in any number of" +
                " activities, including their original job, herding."
    ),
    Items(
        R.drawable.bernese_mountain_dog,
        "Bernese Mountain Dog",
        "The Bernese Mountain Dog is an extremely versatile working dog from the farmlands" +
                " of Switzerland. They were developed to herd cattle, pull carts, and be watchdogs" +
                " and loyal companions. They’re one of four types of Swiss Mountain Dogs, and the " +
                "only one with long hair."
    ),
    Items(
        R.drawable.afador,
        "afador",
        "The Afador is a mixed breed dog–a cross between the Afghan Hound and Labrador" +
                " Retriever dog breeds. Loyal, energetic, and affectionate, these pups inherited " +
                "some of the best qualities from both of their parents."
    ),
    Items(
        R.drawable.akita,
        "akita",
        "The Akita Pit is a mixed breed dog–a cross between the Akita and American Pit Bull " +
                "Terrier dog breeds. Intelligent, protective, and loyal, these pups inherited some" +
                " of the best traits from both of their parents"
    ),
    Items(
        R.drawable.american_staffodshire,
        "American Staffordshire Terrier",
        "The American Staffordshire Terrier is a muscular breed known for being strong" +
                " for its size; however, they’re also loving and affectionate with human family" +
                " members. American Staffordshire Terriers enjoy nothing more than being with the" +
                " humans they care about, whether they’re out for a jog, playing in the yard, or " +
                "cuddling up on the couch."
    ),
    Items(
        R.drawable.kelpie,
        "Australian Kelpie",
        "The Australian Kelpie was originally bred to have the energy, intelligence," +
                " and independence to herd livestock all day in the hot Australian climate without " +
                "much need for supervision. They retain those qualities to this day."
    ),
    Items(
        R.drawable.australian_shepherd,
        "Australian Shepherd",
        "The Australian Shepherd Lab Mix is a mixed breed dog — a cross between the " +
                "Australian Shepherd and the Labrador Retriever dog breeds. Medium in size, " +
                "energetic, and loyal, these pups inherited some amazing traits from both of" +
                " their parents."
    ),
    Items(
        R.drawable.basset_hound,
        "Basset Hound",
        "The Basset Hound dog breed was bred for hunting small game such as rabbits " +
                "and is still used for this purpose in some parts of the United States. When " +
                "they’re not on the trail of a bunny, they’re laid-back family friends who love kids."
    ),
    Items(
        R.drawable.belgian_tervuren,
        "Belgian Tervuren",
        "Created in Belgium in the late 19th century, the Belgian Tervuren dog breed " +
                "is often considered to be the most elegant of the four Belgian sheepdogs. They’" +
                "re intelligent and athletic, making them a versatile performer in any number of" +
                " activities, including their original job, herding."
    ),
    Items(
        R.drawable.bernese_mountain_dog,
        "Bernese Mountain Dog",
        "The Bernese Mountain Dog is an extremely versatile working dog from the farmlands" +
                " of Switzerland. They were developed to herd cattle, pull carts, and be watchdogs" +
                " and loyal companions. They’re one of four types of Swiss Mountain Dogs, and the " +
                "only one with long hair."
    )
)



<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".SecondActivity">

    <EditText
        android:id="@+id/tv1"
        android:layout_width="200dp"
        android:layout_height="0dp"
        android:layout_marginStart="150dp"
        android:layout_marginLeft="150dp"
        android:layout_marginEnd="150dp"
        android:layout_marginRight="150dp"
        android:layout_marginBottom="23dp"
        android:inputType="textPersonName"
        app:layout_constraintBottom_toTopOf="@+id/t3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.651"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/t2" />

    <EditText
        android:id="@+id/tv"
        android:layout_width="200dp"
        android:layout_height="0dp"
        android:layout_marginStart="150dp"
        android:layout_marginLeft="150dp"
        android:layout_marginEnd="150dp"
        android:layout_marginRight="150dp"
        android:layout_marginBottom="26dp"
        android:inputType="textPersonName"

        app:layout_constraintBottom_toTopOf="@+id/t2"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.651"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/t1" />

    <TextView
        android:id="@+id/t1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:text="Book Name"
        android:textSize="25dp"
        app:layout_constraintBottom_toTopOf="@+id/tv"
        app:layout_constraintEnd_toEndOf="@+id/t2"
        app:layout_constraintHorizontal_bias="0.51"
        app:layout_constraintStart_toStartOf="@+id/t2"
        app:layout_constraintTop_toBottomOf="@+id/b2" />

    <TextView
        android:id="@+id/t2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:text="Author name"
        android:textSize="25dp"
        app:layout_constraintBottom_toTopOf="@+id/tv1"
        app:layout_constraintEnd_toEndOf="@+id/t3"
        app:layout_constraintStart_toStartOf="@+id/t3"
        app:layout_constraintTop_toBottomOf="@+id/tv" />

    <TextView
        android:id="@+id/t3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="43dp"
        android:layout_marginLeft="43dp"
        android:layout_marginBottom="19dp"
        android:ems="10"
        android:text="Availibility"
        android:textSize="25dp"
        app:layout_constraintBottom_toTopOf="@+id/rb1"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tv1" />

    <RadioButton
        android:id="@+id/rb1"
        android:layout_width="150dp"
        android:layout_height="0dp"
        android:layout_marginStart="49dp"
        android:layout_marginLeft="49dp"
        android:layout_marginEnd="50dp"
        android:layout_marginRight="50dp"
        android:layout_marginBottom="9dp"
        android:text="Available"
        android:textSize="18dp"
        app:layout_constraintBottom_toTopOf="@+id/rb2"
        app:layout_constraintEnd_toEndOf="@+id/tv1"
        app:layout_constraintStart_toStartOf="@+id/t3"
        app:layout_constraintTop_toBottomOf="@+id/t3" />

    <RadioButton
        android:id="@+id/rb2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="47dp"
        android:text="Not Available"
        android:textSize="18dp"
        app:layout_constraintBottom_toTopOf="@+id/b1"
        app:layout_constraintStart_toStartOf="@+id/rb1"
        app:layout_constraintTop_toBottomOf="@+id/rb1" />

    <Button
        android:id="@+id/b1"
        android:layout_width="200dp"
        android:layout_height="wrap_content"
        android:layout_marginBottom="144dp"
        android:background="#fafafa"
        android:text="Add New"
        android:textColor="@android:color/holo_purple"
        android:textSize="20dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/rb2" />

    <Button
        android:id="@+id/b2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:layout_marginEnd="16dp"
        android:layout_marginRight="16dp"
        android:layout_marginBottom="76dp"
        android:background="#fafafa"
        android:text="Connect to library database"
        app:layout_constraintBottom_toTopOf="@+id/t1"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent" />


</androidx.constraintlayout.widget.ConstraintLayout>

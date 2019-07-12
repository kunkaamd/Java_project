<?php

use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class Createsanpham extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('sanpham', function (Blueprint $table) {
            $table->increments("id");
		$table->Text field('name');
		$table->decimal('gia',15,2);
		$table->string('hinhanh');
		$table->string('mota');
		$table->integer('soluong');
		$table->integer('theloai_id')->references('id')->on('theloai');
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::drop('sanpham');
    }
}

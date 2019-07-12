<?php

namespace App\Http\Requests\autoWeb;

use App\Http\Requests\Request;
class RegisterRequest extends Request
{
    /**
     * Determine if the user is authorized to make this request.
     *
     * @return bool
     */
    public function authorize()
    {
        return true;
    }

    /**
     * Get the validation rules that apply to the request.
     *
     * @return array
     */
    public function rules()
    {
        return [
            'name' => 'min:5',
            'email' => 'min:10|unique:users,email',
            'password' => 'confirmed|min:5',
        ];
    }
    public function messages(){
        return [
            'name.min' => 'name phải dài hơn 5 ký tự',
            'email.min' => 'email phải dài hơn 10 ký tự',
            'email.unique' => 'email đã tồn tại',
            'password.min' => 'password phải dài hơn 5 ký tự',
            'password.confirmed' => 'password và confirm password không giống nhau',
        ];
    }
}

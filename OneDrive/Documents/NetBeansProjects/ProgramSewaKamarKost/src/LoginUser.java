/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abbiyi Qobus Syamsid
 */
class LoginUser {
    private String username;
    private  String password;

   public LoginUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
   
   public boolean login(String inputUsername, String inputPassword) {
        if (username.equals(inputUsername) && password.equals(inputPassword)) {
            System.out.println("\nLogin sukses  \nSelamat datang, " + username + "!");
            return true;
        } else {
            System.out.println("\nLogin gagal \nNama pengguna atau kata sandi salah!.");
            return false;
        }
    }
   
   public void register(String newUsername, String newPassword) {
        this.username = newUsername;
        this.password = newPassword;
        System.out.println("\nPendaftaran berhasil \nSilakan login.");
    }

    
    public String getUsername() {
        return username;
    }
    

    
    
    
}

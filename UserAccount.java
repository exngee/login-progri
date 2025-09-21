public class UserAccount {
        private String username;
        private String password;
        private boolean active = true;

        private String[][] accounts =
                {
                  {"supermario", "Mario_64"},
                  {"coffe", "Java-10"}
        };


        public UserAccount(String username, String password)
        {
            this.username = username;
            this.password = password;

        }

        public boolean checkPassword()
        {
            for (String[] account : accounts) {
                if (username.equals(account[0]) && password.equals(account[1])) {
                    return true;
                }
            }
            return false;
        }

        public void deactivateAccount()
        {
           active = false;
        }

        public boolean isActive() {
            return active;
        }
    }

package OOPBasic;

public class UserInfoRepository implements UserInfoDao{
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete = " + userInfo.getUserId());
    }
}

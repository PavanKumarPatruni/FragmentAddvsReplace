# FragmentAddvsReplace

## Replace
    
    fragmentTransaction.replace(int containerViewId, Fragment fragment, String tag)

Description - Replace an existing fragment that was added to a container. This is essentially the same as calling remove(Fragment) for all currently added fragments that were added with the same containerViewId and then add(int, Fragment, String) with the same arguments given here.

## Add
    
    fragmentTransaction.add(int containerViewId, Fragment fragment, String tag)

Description - Add a fragment to the activity state. This fragment may optionally also have its view (if Fragment.onCreateView returns non-null) into a container view of the activity.

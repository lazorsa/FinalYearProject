export const PAGES_MENU = [
  {
    path: 'pages',
    children: [
      {
        path: 'dashboard',
        data: {
          menu: {
            title: 'Home',
            icon: 'ion-android-home',
            selected: false,
            expanded: false,
            order: 0
          }
        },
        children: [
        {
          path: ['/profile'],
          data: {
            menu: {
              title: 'Profile'
            }
          }
        }
      ]
      },
      {
        path: 'manage',
        data: {
          menu: {
            title: 'Manage',
            icon: 'ion-settings',
            selected: false,
            expanded: false,
            order: 600,
          }
        },
        children: [
          {
            path: 'subjects',
            data: {
              menu: {
                title: 'Subjects',
              }
            }
          }
        ]
      },
      {
        path: 'generateTT',
        data: {
          menu: {
            title: 'Generate TT',
            icon: 'ion-gear-a',
            selected: false,
            expanded: false,
            order: 650,
          }
        }
      },
      {
        path: 'viewTT',
        data: {
          menu: {
            title: 'View TT',
            icon: 'ion-document',
            selected: false,
            expanded: false,
            order: 650,
          }
        }
      },
      {
        path: 'addPreferences',
        data: {
          menu: {
            title: 'Add Preferences',
            icon: 'ion-plus-round',
            selected: false,
            expanded: false,
            order: 650,
          }
        }
      },
      {
        path: 'mail',
        data: {
          menu: {
            title: 'Mail',
            icon: 'ion-email',
            selected: false,
            expanded: false,
            order: 650,
          }
        }
      }
    ]
  }
];
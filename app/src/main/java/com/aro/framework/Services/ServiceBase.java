package com.aro.framework.Services;

import com.aro.framework.Log.Logger;

public abstract class ServiceBase implements IService
{
    /// <summary>
    /// 记录类
    /// </summary>
    public Logger Logger;

    /// <summary>
    /// 构造服务基类
    /// </summary>
    protected ServiceBase(string name)
    {
        Name = name;
        Logger = new Logger();
    }


    /// <summary>
    /// 启动服务
    /// </summary>
    public void Start()
    {
        if (IsRunning)
        {
            Logger.Error(string.Format("[{0}]已启动，请勿重复启动！", Name));
            return;
        }

        if (Starting != null) Starting();
        IsRunning = true;
        if (Started != null) Started();

        Logger.Info(string.Format("[{0}]启动成功！", Name));
    }

    /// <summary>
    /// 停止服务
    /// </summary>
    public void Stop()
    {
        if (!IsRunning)
        {
            Logger.Error(string.Format("[{0}]已关闭，请勿重复关闭！", Name));
            return;
        }

        if (Stopping != null) Stopping();
        IsRunning = false;
        if (Stopped != null) Stopped();

        Logger.Info(string.Format("[{0}]关闭成功！", Name));
    }

    /// <summary>
    /// 正在启动事件
    /// </summary>
    public event Action Starting;

    /// <summary>
    /// 已经启动事件
    /// </summary>
    public event Action Started;

    /// <summary>
    /// 正在关闭事件
    /// </summary>
    public event Action Stopping;

    /// <summary>
    /// 已经关闭事件
    /// </summary>
    public event Action Stopped;
}
